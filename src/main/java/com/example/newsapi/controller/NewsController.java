package com.example.newsapi.controller;

import com.example.newsapi.model.NewsDto;
import com.example.newsapi.service.NewsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
class NewsController {

    private final NewsService service;

    @GetMapping("/news")
    public NewsDto getNews() {
        return service.getNews();
    }
}
