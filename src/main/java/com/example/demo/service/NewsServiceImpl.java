package com.example.demo.service;

import com.example.demo.models.News;
import com.example.demo.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements  NewsService{

    @Autowired
    NewsRepository repository;

    @Override
    public List<News> getAllNews() {
        return repository.findAll();
    }

    @Override
    public News Ifsource(String source) {
        List<News> news = repository.findAll();
        for (News n: news) {
            if (n.getSource().equals(source)) {
                return n;
            }
        }
        return null;
    }
}
