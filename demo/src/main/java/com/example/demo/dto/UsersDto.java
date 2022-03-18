package com.example.demo.dto;

import com.example.demo.model.Users;

public class UsersDto { 
    private String username;

    private String password;

    private Double dollarBalance;

    private Boolean enabled = true;


    public Users transformaParaObjeto(){
        return new Users(
                username,
                password,
                dollarBalance,
                enabled
        );
    }
    
}
