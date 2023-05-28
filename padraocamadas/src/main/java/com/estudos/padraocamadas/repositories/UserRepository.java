package com.estudos.padraocamadas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudos.padraocamadas.models.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
