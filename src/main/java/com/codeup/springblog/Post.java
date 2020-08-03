package com.codeup.springblog;

public class Post {

    private String title;
    private String post;

    public Post(String title, String post) {
        this.title = title;
        this.post = post;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
}
