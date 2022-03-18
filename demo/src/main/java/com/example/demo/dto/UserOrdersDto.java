package com.example.demo.dto;

import com.example.demo.model.UserOrders;
import com.example.demo.model.Users;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
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
