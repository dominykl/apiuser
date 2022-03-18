package com.example.demo.dto;

import com.example.demo.model.UserStockBalance;
import com.example.demo.model.UserStockBalanceId;
import com.example.demo.model.Users;


public class UserStockBalanceDto  {
    private Long idUser;

    private Long idStock;

    private String stockSymbol;

    private String stockName;

    private Long volume;

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

    public UserStockBalanceDto(Long idUser, Long idStock, String stockSymbol, String stockName, Long volume) {
        this.idUser = idUser;
        this.idStock = idStock;
        this.stockSymbol = stockSymbol;
        this.stockName = stockName;
        this.volume = volume;
    }

    public UserStockBalanceDto() {
    }

    public UserStockBalance transformaParaObjeto(Users users){
        return new UserStockBalance( new UserStockBalanceId(users, idStock),
                stockSymbol,
                stockName,
                volume);
    }
}
