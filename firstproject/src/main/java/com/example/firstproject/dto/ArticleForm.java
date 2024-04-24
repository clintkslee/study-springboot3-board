package com.example.firstproject.dto;

public class ArticleForm {
    private String title;
    private String cotent;

    public ArticleForm(String title, String cotent) {
        this.title = title;
        this.cotent = cotent;
    }

    @Override
    public String toString() {
        return "ArticleForm{" +
                "title='" + title + '\'' +
                ", cotent='" + cotent + '\'' +
                '}';
    }
}
