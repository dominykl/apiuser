package com.example.demo.service;

import java.util.Optional;

import com.example.demo.model.UserStockBalance;
import com.example.demo.model.UserStockBalanceId;
import com.example.demo.model.Users;
import com.example.demo.repository.UserStockBalanceRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UsersStockBalanceService {
    private final UserStockBalanceRepository userStockBalanceRepository;
    public Optional<UserStockBalance> findById(Users users, Long id_stock){
        return userStockBalanceRepository.findById(new UserStockBalanceId(users, id_stock));
    }
    public UserStockBalance salvar(UserStockBalance userStockBalance) {
        return userStockBalanceRepository.save(userStockBalance);
    }
}
