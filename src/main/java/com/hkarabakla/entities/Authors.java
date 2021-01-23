package com.hkarabakla.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Authors {
    @Id
    @GeneratedValue
    private int id;
    private String name;


    @OneToMany(mappedBy = "authors")
    private List<AuthorBook> authorBooks;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
