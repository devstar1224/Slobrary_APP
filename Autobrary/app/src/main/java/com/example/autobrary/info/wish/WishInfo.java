package com.example.autobrary.info.wish;

public class WishInfo {
    private String user;
    private String bookTitle;
    private String bookAuthor;
    private String bookPublish;
    private String bookDate;
    private String status;

    public WishInfo(String user, String bookTitle, String bookAuthor, String bookPublish){
        this.user = user;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookPublish = bookPublish;
    }

    public WishInfo(String user, String bookTitle, String bookAuthor, String bookPublish, String applyStatus){
        this.user = user;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookPublish = bookPublish;
        this.status = applyStatus;
    }

    public WishInfo(String user, String bookTitle, String bookAuthor, String bookPublish, String wdate, String applyStatus){
        this.user = user;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookPublish = bookPublish;
        this.bookDate = wdate;
        this.status = applyStatus;
    }

    public WishInfo(){}


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookPublish() {
        return bookPublish;
    }

    public void setBookPublish(String bookPublish) {
        this.bookPublish = bookPublish;
    }

    public String getBookDate() {
        return bookDate;
    }

    public void setBookDate(String bookDate) {
        this.bookDate = bookDate;
    }
}
