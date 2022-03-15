package com.example.demo.service;

import com.example.demo.dto.UserOrdersDto;
import com.example.demo.model.UserOrders;
import com.example.demo.model.Users;
import com.example.demo.repository.UserOrdersRepository;
import com.example.demo.repository.UsersRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service 
public class UserOrderService {
    private final UserOrdersRepository userordersrepository;
    private final UsersRepository usersRepository;
    public UserOrdersDto salvar(UserOrdersDto userordersdto, String token){
        Users users = usersRepository.findById(userordersdto.getId_user()).orElseThrow();
        userordersrepository.save(userordersdto.transformaParaObjeto(users));
        return userordersdto;

    }
    public List<UserOrders>listorder(){
        return userordersrepository.findAll();
    }
}
