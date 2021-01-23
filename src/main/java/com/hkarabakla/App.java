package com.hkarabakla;
import com.hkarabakla.entities.Book;
import com.hkarabakla.entities.User;

import com.hkarabakla.services.BookService;
import com.hkarabakla.services.OrderService;
import com.hkarabakla.services.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {


        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
        appContext.scan("com.hkarabakla");
        appContext.refresh();



        UserService userService = (UserService) appContext.getBean("userService");
        User user = userService.userOperations("user","Gazi","12","İstanbul");
        User user2 = userService.userOperations("user2","Ateş","127","Sakarya");


        BookService bookService = (BookService) appContext.getBean("bookService");
        Book book1 = bookService.BookOperastions("book1","cs");
        Book book2 = bookService.BookOperastions("book2","cs");
        Book book3 = bookService.BookOperastions("book3","cs");
        Book book4 = bookService.BookOperastions("book4","cs");
        Book book5 = bookService.BookOperastions("book5","cs");
        Book book6 = bookService.BookOperastions("book6","cs");

        for (int i = 0; i <bookService.getAllBooks().size(); i++) {
            System.out.println(bookService.getAllBooks().get(i));

        }







        OrderService orderService = (OrderService) appContext.getBean("orderService");
       orderService.OrderOperations(user,500);
       orderService.OrderOperations(user,500);


        appContext.close();

    }
}
