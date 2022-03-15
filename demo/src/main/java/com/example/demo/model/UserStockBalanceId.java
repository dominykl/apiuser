package com.example.demo.model;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Objects;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Embeddable
public class UserStockBalanceId {

    @ManyToOne
    @JoinColumn(name = "id_user")
    private Users users;
    private Long id_stock;

    public UserStockBalanceId() {
    }

    public UserStockBalanceId(Users users, Long id_stock) {
        this.users = users;
        this.id_stock = id_stock;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserStockBalanceId that = (UserStockBalanceId) o;
        return Objects.equals(users, that.users) && Objects.equals(id_stock, that.id_stock);
    }

    @Override
    public int hashCode() {
        return Objects.hash(users, id_stock);
    }
    
}
