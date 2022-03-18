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
    @Column(name="username")
    private String username;

    @Column(name="password")
    private String password;

    @Column(name="dollar_balance")
    private Double dollarBalance;

    @Column(name="enabled")
    private Boolean enabled = true;

    @Column(name="created_on")
    private Timestamp createdOn;

    @Column(name="updated_on")
    private Timestamp updatedOn;
    
    public Users (){
        this.enabled = true;
        this.createdOn = Timestamp.valueOf(LocalDateTime.now());
        this.updatedOn = Timestamp.valueOf(LocalDateTime.now());
    }

    public Users(String username, String password, Double dollarBalance, Boolean enabled) {
        this.username = username;
        this.password = password;
        this.dollarBalance = dollarBalance;
        this.enabled = enabled;
        this.createdOn = Timestamp.valueOf(LocalDateTime.now());
        this.updatedOn = Timestamp.valueOf(LocalDateTime.now());
    }



    
}
