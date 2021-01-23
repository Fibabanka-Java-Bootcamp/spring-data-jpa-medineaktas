package com.hkarabakla.services;

import com.hkarabakla.entities.Orders;
import com.hkarabakla.entities.User;
import com.hkarabakla.repositories.OrderRepo;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.util.List;

@Component
public class OrderService {
    private final OrderRepo repo;


    public OrderService(OrderRepo repo) {
        this.repo = repo;
    }

    public void OrderOperations(User user , double total){


        Orders orders = new Orders();
        orders.setUser(user);
        orders.setTotal(total);
        //orders.setOrderBooks();

        repo.save(orders);


        System.out.println(orders);




    }


}
