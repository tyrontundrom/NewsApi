package com.example.newsapi.controller;

import com.example.newsapi.model.NewsDto;
import com.example.newsapi.service.NewsService;
import lombok.AllArgsConstructor;
import lombok.Generated;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
class NewsController {

    private final NewsService service;

    @GetMapping("/news")
    public NewsDto getNews() {
        return service.getNews();
    }
}
