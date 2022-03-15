package com.example.demo.dto;

import com.example.demo.model.UserOrders;
import com.example.demo.model.Users;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class UserOrdersDto {   
    private Long id_user;

    private Long id_stock;

    private String stock_symbol;

    private String stock_name;

    private Long volume;

    private Integer type;

    private Integer status;

    private Double price;

    private Long remaining_volume;


    public UserOrdersDto(){}

    public UserOrders transformaParaObjeto(Users users){
        return new UserOrders(
                users,
                id_stock,
                stock_symbol,
                stock_name,
                volume,
                type,
                status,
                price,
                remaining_volume);
    }
    
}
