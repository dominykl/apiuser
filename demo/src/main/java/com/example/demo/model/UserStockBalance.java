package com.example.demo.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import javax.persistence.Column;
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

    @Column(name="stock_symbol")
    private String stockSymbol;

    @Column(name="stock_name")
    private String stockName;

    @Column(name="volume")
    private Long volume;

    @Column(name="create_on")
    @CreationTimestamp
    private Timestamp createdOn;

    @Column(name="updated_on")
    @UpdateTimestamp
    private Timestamp updatedOn;
    
    public UserStockBalance(UserStockBalanceId id , String stockSymbol, String stockName, Long volume) {
        this.id = id;

        this.stockSymbol = stockSymbol;

        this.stockName = stockName;

        this.volume = volume;

        this.createdOn = Timestamp.valueOf(LocalDateTime.now());
        this.updatedOn = Timestamp.valueOf(LocalDateTime.now());
    }
}
