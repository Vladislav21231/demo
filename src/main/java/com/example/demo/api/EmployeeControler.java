package com.example.demo.api;

import com.example.demo.models.News;
import com.example.demo.service.NewsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("${application.endpoint.root}")
@RequiredArgsConstructor
public class EmployeeControler {

    private final NewsService newsService;

    @GetMapping("${application.endpoint.employee}")
    public ResponseEntity<List<News>> getEmployees() {
        return ResponseEntity.ok().body(newsService.getAllNews());
    }
}
