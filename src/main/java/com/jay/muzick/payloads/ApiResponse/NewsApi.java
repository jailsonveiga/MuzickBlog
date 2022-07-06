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
}
