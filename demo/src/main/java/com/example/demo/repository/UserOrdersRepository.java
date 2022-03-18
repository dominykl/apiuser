package com.example.demo.repository;

import com.example.demo.model.UserOrders;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserOrdersRepository extends JpaRepository <UserOrders, Long> {
    
}
