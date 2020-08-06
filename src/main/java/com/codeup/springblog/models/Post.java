package com.codeup.springblog.models;

//import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 50, nullable = false, unique = true)
    private String title;

    @Column(columnDefinition = "TEXT NOT NULL")
    private String post;

    @OneToMany(mappedBy = "parentPost")
//    @JsonManagedReference
//    @JsonBackReference
    private List<Comment> comments;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User parentUser;



    public Post(long id, String title, String post) {
        this.id= id;
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

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public User getParentUser() {
        return parentUser;
    }

    public void setParentUser(User parentUser) {
        this.parentUser = parentUser;
    }


    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", post='" + post + '\'' +
                '}';
    }
}
