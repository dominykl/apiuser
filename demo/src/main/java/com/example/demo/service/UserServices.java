package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.UsersDto;
import com.example.demo.model.Users;
import com.example.demo.repository.UsersRepository;

import org.springframework.stereotype.Service;


import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServices {
    private final UsersRepository usersrepository;
    public UsersDto salvar(UsersDto saveUserDto) {
        Users users = saveUserDto.transformaParaObjeto();
        usersrepository.save(users);
        return saveUserDto;
    }
    public List<Users> listAll(){
        return usersrepository.findAll();
    }
    public Users findById(Long id) {
        Users users = usersrepository.findById(id).orElseThrow();
        return users;
    }


}
