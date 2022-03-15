package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name="users")
public class Users implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private Double dollar_balance;
    private Boolean enabled = true;
    private Timestamp created_on;
    private Timestamp updated_on;
    
    public Users (){
        this.enabled = true;
        this.created_on = Timestamp.valueOf(LocalDateTime.now());
        this.updated_on = Timestamp.valueOf(LocalDateTime.now());
    }

    public Users(String username, String password, Double dollar_balance, Boolean enabled) {
        this.username = username;
        this.password = password;
        this.dollar_balance = dollar_balance;
        this.enabled = enabled;
        this.created_on = Timestamp.valueOf(LocalDateTime.now());
        this.updated_on = Timestamp.valueOf(LocalDateTime.now());
    }



    
}