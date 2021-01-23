package com.hkarabakla.entities;

import javax.persistence.*;
import java.text.DateFormat;
import java.util.List;
import java.util.Set;

@Entity

public class Orders {

    @Id
    @GeneratedValue
    private int id;


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id",referencedColumnName = "id")
    private  User user;
    private double total;



    @OneToMany(mappedBy = "orders" ,cascade = CascadeType.ALL )
    private List<OrderBook> orderBooks;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }




    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", user=" + user +
                ", total=" + total +
                ", orderBooks=" + orderBooks +
                '}';
    }
}
