package com.example.demo.service;

import com.example.demo.dto.UserOrdersDto;
import com.example.demo.model.UserOrders;
import com.example.demo.model.Users;
import com.example.demo.repository.UserOrdersRepository;
import com.example.demo.repository.UsersRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service 
public class UserOrderService {
    @Autowired
    UserOrdersRepository userordersrepository;
    @Autowired
     UsersRepository usersRepository;
    public UserOrdersDto salvar(UserOrdersDto userordersdto){
        Users users = usersRepository.findById(userordersdto.getIdUser()).orElseThrow();
        userordersrepository.save(userordersdto.transformaParaObjeto(users));
        return userordersdto;

    }
    public List<UserOrders>listorder(){
        return userordersrepository.findAll();
    }
}
