package com.example.demo.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="user_stock_balances")
public class UserStockBalance implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private UserStockBalanceId id;

    private String stock_symbol;

    private String stock_name;

    private Long volume;

    @CreationTimestamp
    private Timestamp created_on;

    @UpdateTimestamp
    private Timestamp updated_on;
    
    public UserStockBalance(UserStockBalanceId id , String stock_symbol, String stock_name, Long volume) {
        this.id = id;

        this.stock_symbol = stock_symbol;

        this.stock_name = stock_name;

        this.volume = volume;

        this.created_on = Timestamp.valueOf(LocalDateTime.now());
        this.updated_on = Timestamp.valueOf(LocalDateTime.now());
    }
}
