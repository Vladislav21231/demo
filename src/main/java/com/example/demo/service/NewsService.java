package com.example.demo.service;

import com.example.demo.models.News;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NewsService {
    public List<News> getAllNews();
    public News Ifsource(String source);
}
