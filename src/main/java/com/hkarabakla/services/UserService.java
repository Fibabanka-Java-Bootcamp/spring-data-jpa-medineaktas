package com.hkarabakla.services;

import com.hkarabakla.entities.Address;
import com.hkarabakla.entities.Orders;
import com.hkarabakla.entities.User;
import com.hkarabakla.repositories.UserRepo;
import org.springframework.stereotype.Component;

import java.text.DateFormat;

@Component
public class UserService {

    private final UserRepo repo;

    public UserService(UserRepo repo) {
        this.repo = repo;
    }

    public User  userOperations(String name,String street, String number, String city) {
        User u = new User();
        u.setName(name);

        Address address = new Address();
        address.setStreet(street);
        address.setNumber(number);
        address.setCity(city);

        u.setAddress(address);




        repo.save(u);
        System.out.println(u);

        //System.out.println(u.getId());

        //System.out.println(repo.findAllByNameContainingIgnoreCase("se"));
        return u;
    }
}
