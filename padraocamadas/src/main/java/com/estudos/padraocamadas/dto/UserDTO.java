package com.estudos.padraocamadas.dto;

import com.estudos.padraocamadas.models.User;

public class UserDTO {
    
    private Long id;

    private String name;

    public UserDTO(){

    }

    public UserDTO(Long id, String name){
        this.id = id;
        this.name = name;
    }

    public UserDTO(User user){
        if(user != null){
            this.id = user.getId();
            this.name = user.getName();            
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

}
