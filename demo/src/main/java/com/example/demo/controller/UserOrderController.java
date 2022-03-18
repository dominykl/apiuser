package com.example.demo.controller;

import com.example.demo.dto.UserOrdersDto;
import com.example.demo.model.UserOrders;
import com.example.demo.service.UserOrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("http://localhost:8083/")
@RestController
public class UserOrderController {
    @Autowired
    UserOrderService userorderservice;
    public ResponseEntity<UserOrdersDto> salvarOrder (@RequestBody UserOrdersDto userorderdto){
        try{
            return ResponseEntity.ok().body(userorderservice.salvar(userorderdto));
        } catch(Exception e){
            return ResponseEntity.badRequest().build();
        }
    }

    public List<UserOrders> listaDeOrdem(){
        return userorderservice.listorder();
    }

}
