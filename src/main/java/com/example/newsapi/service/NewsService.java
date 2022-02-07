package com.example.newsapi.service;

import com.example.newsapi.model.ArticlesDto;
import com.example.newsapi.model.NewsDto;
import com.example.newsapi.web.NewsClient;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class NewsService {

    private final NewsClient newsClient;

    public NewsDto getNews() {

        return newsClient.getNews();
    }

    public void saveNewsToFile(Integer id) {
        newsClient.saveToFile(id);
    }
}
