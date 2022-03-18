package com.example.demo.service;

import java.util.Optional;

import com.example.demo.model.UserStockBalance;
import com.example.demo.model.UserStockBalanceId;
import com.example.demo.model.Users;
import com.example.demo.repository.UserStockBalanceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class UsersStockBalanceService {
   @Autowired
    UserStockBalanceRepository userStockBalanceRepository;
    public Optional<UserStockBalance> findById(Users users, Long idStock){
        return userStockBalanceRepository.findById(new UserStockBalanceId(users, idStock));
    }
    public UserStockBalance salvar(UserStockBalance userStockBalance) {
        return userStockBalanceRepository.save(userStockBalance);
    }
}
