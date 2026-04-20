package com.thinkworks.objectclass.internal;

public class Book {
    private int bookId;
    private String title;
    private String author;
    private double price;
    private int pages;

    public Book(int bookId, String title, String author, double price, int pages) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "ID : "+bookId+", Title : "+title+", Author : "+
                author+", Price : "+price+", Pages : "+pages;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Book){
            com.thinkworks.objectclass.internal.Book book =(Book) obj;
            if(this.bookId==book.getBookId()){
                if(this.title.equals(book.getTitle())){
                    if(this.author.equals(book.getAuthor())){
                        if(this.price==book.getPrice()){
                            if(this.pages==book.getPages()){
                                return true;
                            }
                        } return false;
                    } return false;
                } return false;
            }return false;
        }
        else return false;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
