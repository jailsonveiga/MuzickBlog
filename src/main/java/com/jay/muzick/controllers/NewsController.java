package com.jay.muzick.controllers;

import com.jay.muzick.payloads.ApiResponse.NewsApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@CrossOrigin
@RestController
@RequestMapping("/api/news")
public class NewsController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${muzick.props.apikey}")
    public String apikey;

    @GetMapping("/test")
    public ResponseEntity<String> testRoute() {
        return new ResponseEntity<>("News Routes", HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<?> getMusicArticles() {
        String url = "https://newsapi.org/v2/everything?apikey=" + apikey + "&q=music";

        NewsApi response = restTemplate.getForObject(url, NewsApi.class);

        System.out.println(response.getStatus());
        System.out.println(response.getArticles().get(0).getTitle());
        System.out.println(response.getArticles().get(0));

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
