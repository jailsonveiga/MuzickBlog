package com.jay.muzick.payloads.ApiResponse;

public class Article {

    private class source{
        private String id;
        private String name;

        //Default Constructor
        public source() {
        }

        //Constructor
        public source(String id, String name) {
            this.id = id;
            this.name = name;
        }

        //Getter and Setter
        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    private String source;
    private String author;
    private String title;
    private String description;
    private String url;
    private String urlToImage;

    //Default Constructor
    public Article() {
    }

    //Constructor
    public Article(String source, String author, String title, String description, String url, String urlToImage) {
        this.source = source;
        this.author = author;
        this.title = title;
        this.description = description;
        this.url = url;
        this.urlToImage = urlToImage;
    }

    //Getter and Setter
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrlToImage() {
        return urlToImage;
    }

    public void setUrlToImage(String urlToImage) {
        this.urlToImage = urlToImage;
    }
}
