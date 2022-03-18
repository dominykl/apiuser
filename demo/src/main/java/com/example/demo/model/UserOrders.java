package com.example.demo.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;



@AllArgsConstructor
@Entity
@Table(name="user_orders")
public class UserOrders implements Serializable{

    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="id_user")
    private Users users;

    private Long idStock;

    private String stockSymbol;

    private String stockName;

    private Long volume;

    private Integer type;

    private Integer status;

    private Double price;

    private Timestamp createdOn;

    private Timestamp updatedOn;

    private Long remainingVolume;
    
    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Long getIdStock() {
        return idStock;
    }

    public void setIdStock(Long idStock) {
        this.idStock = idStock;
    }

    public String getStockSymbol() {
        return stockSymbol;
    }

    public void setStockSymbol(String stockSymbol) {
        this.stockSymbol = stockSymbol;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public Long getVolume() {
        return volume;
    }

    public void setVolume(Long volume) {
        this.volume = volume;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Timestamp getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    public Timestamp getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Timestamp updatedOn) {
        this.updatedOn = updatedOn;
    }

    public Long getRemainingVolume() {
        return remainingVolume;
    }

    public void setRemainingVolume(Long remainingVolume) {
        this.remainingVolume = remainingVolume;
    }

    public UserOrders(Users users, Long idStock, String stockSymbol, String stockName, Long volume, Integer type, Integer status, Double price, Long remainingVolume) {
        this.users = users;
        this.idStock = idStock;
        this.stockSymbol = stockSymbol;
        this.stockName = stockName;
        this.volume = volume;
        this.price = price;
        this.type = type;
        this.status = status;
        this.createdOn = Timestamp.valueOf(LocalDateTime.now());
        this.updatedOn = Timestamp.valueOf(LocalDateTime.now());
        this.remainingVolume = remainingVolume;
    }

    public UserOrders(){
        this.createdOn = Timestamp.valueOf(LocalDateTime.now());
        this.updatedOn = Timestamp.valueOf(LocalDateTime.now());
    }



}
