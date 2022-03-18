package com.example.demo.dto;

import com.example.demo.model.UserOrders;
import com.example.demo.model.Users;


public class UserOrdersDto {   
    private Long idUser;

    private Long idStock;

    private String stockSymbol;

    private String stockName;

    private Long volume;

    private Integer type;

    private Integer status;

    private Double price;

    private Long remainingVolume;


    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
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

    public Long getRemainingVolume() {
        return remainingVolume;
    }

    public void setRemainingVolume(Long remainingVolume) {
        this.remainingVolume = remainingVolume;
    }

    public UserOrders transformaParaObjeto(Users users){
        UserOrders userOrders = new UserOrders();
                userOrders.setUsers(users);
                userOrders.setIdStock(idStock);
                userOrders.setStockSymbol(stockSymbol);
                userOrders.setStockName(stockName);
                userOrders.setVolume(volume);
                userOrders.setType(type);
                userOrders.setStatus(status);
                userOrders.setPrice(price);
                userOrders.setRemainingVolume(remainingVolume);

                return userOrders;
    }
    
}
