package com.example.demo.controller;

import com.example.demo.dto.UserOrdersDto;
import com.example.demo.model.UserOrders;
import com.example.demo.service.UserOrderService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
@RestController
public class UserOrderController {
    private final UserOrderService userorderservice;
    public ResponseEntity<UserOrdersDto> salvarOrder (@RequestBody UserOrdersDto userorderdto, @RequestHeader("Authorization") String token){
        try{
            return ResponseEntity.ok().body(userorderservice.salvar(userorderdto,token));
        } catch(Exception e){
            return ResponseEntity.badRequest().build();
        }
    }

    public List<UserOrders> listaDeOrdem(){
        return userorderservice.listorder();
    }

}
