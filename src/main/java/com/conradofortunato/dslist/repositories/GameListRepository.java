package com.conradofortunato.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.conradofortunato.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
    
}
