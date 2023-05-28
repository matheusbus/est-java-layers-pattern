package com.estudos.padraocamadas.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.estudos.padraocamadas.dto.UserDTO;
import com.estudos.padraocamadas.models.User;
import com.estudos.padraocamadas.repositories.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository repository;

    // Anotação transacional para especificar que é algo que está executando no banco e está inserido em uma transação
    // Readonly para especificar que é um método que só irá ler dados e portanto não precisa abrir o banco em modo de escrita
    @Transactional(readOnly = true)
    public UserDTO findById(Long id){
        User user = repository.findById(id).get();
        UserDTO userDTO = new UserDTO(user);
        
        return userDTO;
    }

    @Transactional(readOnly = true)
    public List<UserDTO> findAll(){
        List<UserDTO> usersDTO = new ArrayList<>();

        for (User user : repository.findAll()) {
            usersDTO.add(new UserDTO(user));
        }

        return usersDTO;
    }

}
