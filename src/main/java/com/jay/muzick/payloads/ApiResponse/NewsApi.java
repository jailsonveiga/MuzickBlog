package com.jay.muzick.payloads.ApiResponse;

import java.util.List;

public class NewsApi {
    private String status;
    private Integer totalResults;
    private List<Article> articles;

    //Constructor

    public NewsApi() {
    }

    public NewsApi(String status, Integer totalResults) {
        this.status = status;
        this.totalResults = totalResults;
    }

    //Getter and Setter

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
}
