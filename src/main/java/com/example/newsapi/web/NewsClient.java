package com.example.newsapi.web;

import com.example.newsapi.model.NewsDto;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class NewsClient {
    private final RestTemplate restTemplate = new RestTemplate();

    public NewsDto getNews() {
        NewsDto newsDto = restTemplate.getForObject(
                "https://newsapi.org/v2/top-headlines?country=pl&category=business&" +
                        "apiKey=45abe082d98642389b2f4d2172f0263e", NewsDto.class);
        return newsDto;
    }

}
