package com.conradofortunato.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.conradofortunato.dslist.dto.GameListDTO;
import com.conradofortunato.dslist.entities.GameList;
import com.conradofortunato.dslist.projections.GameMinProjection;
import com.conradofortunato.dslist.repositories.GameListRepository;
import com.conradofortunato.dslist.repositories.GameRepository;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly=true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        List<GameListDTO> dto = result.stream().map(gameList -> new GameListDTO(gameList)).toList();
        return dto;
    }

    @Transactional
    public void Move(Long listId, int sourceIndex, int destinationIndex){
        List<GameMinProjection> list = gameRepository.searchByList(listId);

        GameMinProjection item = list.remove(sourceIndex);
        list.add(destinationIndex, item);

        int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
        int max = sourceIndex > destinationIndex ? sourceIndex : destinationIndex;

        for (int i = min; i <= max; i++) {
            GameMinProjection itemUpdate = list.get(i);
            gameListRepository.updateBelongingPosition(listId, itemUpdate.getId(), i);
        }
    }
}
