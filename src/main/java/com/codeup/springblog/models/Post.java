package com.codeup.springblog.models;

//import javax.persistence.*;

//@Entity
//@Table(name = "posts")
public class Post {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

//    @Column(length = 50, nullable = false, unique = true)
    private String title;

//    @Column(columnDefinition = "TEXT NOT NULL")
    private String post;

    public Post(long id, String title, String post) {
        this.id= id;
        this.title = title;
        this.post = post;
    }

    public Post(String title, String post) {
        this.title = title;
        this.post = post;
    }

    public Post() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
