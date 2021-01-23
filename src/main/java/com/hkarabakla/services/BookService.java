package com.hkarabakla.services;

import com.hkarabakla.entities.Book;
import com.hkarabakla.entities.Category;
import com.hkarabakla.repositories.BookRepo;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;
import java.util.UUID;
@Component

public class BookService {
    private final BookRepo bookRepo;

    public BookService(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    public Book BookOperastions(String name, String categoryName) {

        Book b1 = new Book();
        b1.setIsbn(UUID.randomUUID().toString());
        b1.setName(name);

        Category c1 = new Category();
        c1.setName(categoryName);
        c1.setBooks(Collections.singletonList(b1));



        bookRepo.save(b1);

    //    System.out.println(b1);

        return b1;
    }
    public List getAllBooks(){
        return (List) bookRepo.findAll();
    }
}
