package com.hkarabakla.entities;

import javax.persistence.*;

@Entity
public class AuthorBook {

    @Id
    @GeneratedValue
    private int id;
    private int authorId;
    private String bookIsbn;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "book_isbn",referencedColumnName = "isbn")
    private Book book;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "author_id",referencedColumnName = "id")
    private Authors authors;


    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getBookIsbn() {
        return bookIsbn;
    }

    public void setBookIsbn(String bookIsbn) {
        this.bookIsbn = bookIsbn;
    }
    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }




}
