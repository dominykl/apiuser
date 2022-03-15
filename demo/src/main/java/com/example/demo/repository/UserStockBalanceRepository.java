package com.example.demo.repository;

import com.example.demo.model.UserStockBalance;
import com.example.demo.model.UserStockBalanceId;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserStockBalanceRepository extends JpaRepository <UserStockBalance, UserStockBalanceId>{
    
}
