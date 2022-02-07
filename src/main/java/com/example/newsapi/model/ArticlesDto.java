package com.example.newsapi.model;

import lombok.Getter;

import java.net.URL;

@Getter
public class ArticlesDto {
    private String author;
    private String title;
    private String description;
    private URL url;
}
