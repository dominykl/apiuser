package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.UsersDto;
import com.example.demo.model.Users;
import com.example.demo.repository.UsersRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service

public class UserServices {
    @Autowired
    UsersRepository usersrepository;
    public UsersDto salvar(UsersDto saveUserDto) {
        Users users = saveUserDto.transformaParaObjeto();
        usersrepository.save(users);
        return saveUserDto;
    }
    public List<Users> listAll(){
        return usersrepository.findAll();
    }
    public Users findById(Long id) {
       return usersrepository.findById(id).orElseThrow();
    
    }


}
