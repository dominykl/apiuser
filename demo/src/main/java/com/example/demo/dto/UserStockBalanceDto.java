package com.example.demo.dto;

import com.example.demo.model.UserStockBalance;
import com.example.demo.model.UserStockBalanceId;
import com.example.demo.model.Users;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter


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
