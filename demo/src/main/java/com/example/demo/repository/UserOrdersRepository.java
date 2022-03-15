package com.example.demo.repository;

import com.example.demo.model.UserOrders;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserOrdersRepository extends JpaRepository <UserOrders, Long> {
    
}
