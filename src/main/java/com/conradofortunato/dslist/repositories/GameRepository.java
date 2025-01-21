package com.conradofortunato.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.conradofortunato.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
    
}
