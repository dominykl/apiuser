package com.example.demo.model;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import java.io.Serializable;
import java.util.Objects;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Embeddable
public class UserStockBalanceId implements Serializable {

    @ManyToOne
    @JoinColumn(name = "id_user")
    private Users users;
    private Long idStock;

    public UserStockBalanceId() {
    }

    public UserStockBalanceId(Users users, Long idStock) {
        this.users = users;
        this.idStock = idStock;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserStockBalanceId that = (UserStockBalanceId) o;
        return Objects.equals(users, that.users) && Objects.equals(idStock, that.idStock);
    }

    @Override
    public int hashCode() {
        return Objects.hash(users, idStock);
    }
    
}
