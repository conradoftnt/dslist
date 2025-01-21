package com.conradofortunato.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.conradofortunato.dslist.dto.GameListDTO;
import com.conradofortunato.dslist.entities.GameList;
import com.conradofortunato.dslist.repositories.GameListRepository;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly=true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        List<GameListDTO> dto = result.stream().map(gameList -> new GameListDTO(gameList)).toList();
        return dto;
    }

}