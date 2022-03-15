package com.example.demo.dto;

import com.example.demo.model.Users;

public class UsersDto { 
    private String username;

    private String password;

    private Double dollar_balance;

    private Boolean enabled = true;

    public UsersDto(){}


    public Users transformaParaObjeto(){
        return new Users(
                username,
                password,
                dollar_balance,
                enabled
        );
    }
    
}
