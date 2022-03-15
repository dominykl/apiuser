package com.example.demo.dto;

import com.example.demo.model.UserStockBalance;
import com.example.demo.model.UserStockBalanceId;
import com.example.demo.model.Users;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class UserStockBalanceDto  {
    private Long id_user;

    private Long id_stock;

    private String stock_symbol;

    private String stock_name;

    private Long volume;

    public UserStockBalanceDto(Long id_user, Long id_stock, String stock_symbol, String stock_name, Long volume) {
        this.id_user = id_user;
        this.id_stock = id_stock;
        this.stock_symbol = stock_symbol;
        this.stock_name = stock_name;
        this.volume = volume;
    }

    public UserStockBalanceDto() {
    }

    public UserStockBalance transformaParaObjeto(Users users){
        return new UserStockBalance( new UserStockBalanceId(users, id_stock),
                stock_symbol,
                stock_name,
                volume);
    }
}
