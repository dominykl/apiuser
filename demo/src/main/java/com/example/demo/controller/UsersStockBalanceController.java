package com.example.demo.controller;

import com.example.demo.dto.UserStockBalanceDto;
import com.example.demo.model.UserStockBalance;
import com.example.demo.model.Users;
import com.example.demo.service.UserServices;
import com.example.demo.service.UsersStockBalanceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@CrossOrigin("http://localhost:8083/")
@RestController
@RequiredArgsConstructor
public class UsersStockBalanceController {
    @Autowired
    UsersStockBalanceService usersStockBalanceService;
    @Autowired
    UserServices userServices;

    @PostMapping("/newUserStock")
    public ResponseEntity<UserStockBalance> salvar(@RequestBody UserStockBalanceDto dto) {
        Users users = userServices.findById(dto.getIdUser());
        UserStockBalance userStockBalance = usersStockBalanceService.salvar(dto.transformaParaObjeto(users));
        return new ResponseEntity<>(userStockBalance, HttpStatus.CREATED);
   }
}
