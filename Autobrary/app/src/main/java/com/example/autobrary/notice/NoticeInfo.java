package com.example.autobrary.notice;

public class NoticeInfo {
    String title; //제목
    String date; //날짜
    String name; //작성자



    String contents;
    /* 공지사항 관련 */

    public NoticeInfo(String title, String date, String name, String contents){
        this.title = title;
        this.date = date;
        this.name = name;
        this.contents = contents;
    }
    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
    }
}
