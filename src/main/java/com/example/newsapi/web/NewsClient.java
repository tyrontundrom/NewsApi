package com.example.newsapi.web;

import com.example.newsapi.model.ArticlesDto;
import com.example.newsapi.model.NewsDto;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

@Component
public class NewsClient {
    private final RestTemplate restTemplate = new RestTemplate();

    public NewsDto getNews() {
        NewsDto newsDto = restTemplate.getForObject(
                "https://newsapi.org/v2/top-headlines?country=pl&category=business&" +
                        "apiKey=45abe082d98642389b2f4d2172f0263e", NewsDto.class);
        return newsDto;
    }

    public void saveToFile(Integer id) {
        try {
            String fileContent = getNews().getArticles()[id].getDescription() + " " + getNews().getArticles()[id].getUrl();
            String fileTitle = getNews().getArticles()[id].getAuthor().substring(0, 4) + ""
                    + getNews().getArticles()[id].getTitle().substring(0, 4) + ""
            + getNews().getArticles()[id].getDescription().substring(0, 4);
            String path = "C:/catalog/" + fileTitle + ".txt";
            Files.writeString(Paths.get(path), fileContent, StandardOpenOption.CREATE);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

}
