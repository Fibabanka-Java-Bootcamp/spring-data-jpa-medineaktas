package com.hkarabakla.entities;

import javax.persistence.*;

@Entity
public class OrderBook {

    @Id
    @GeneratedValue
    private int id;

    private int orderId;
    private String bookIsbn;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @JoinColumn(name = "order_id", referencedColumnName = "id")
    @ManyToOne( fetch =  FetchType.EAGER)
    private Orders orders;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_isbn", referencedColumnName = "isbn")
    private Book book;




    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public String getBookIsbn() {
        return bookIsbn;
    }

    public void setBookIsbn(String bookIsbn) {
        this.bookIsbn = bookIsbn;
    }

}
