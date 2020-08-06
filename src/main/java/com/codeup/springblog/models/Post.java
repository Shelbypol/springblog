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
    private List<Comment> comments;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User parentUser;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "post_tag",
            joinColumns={@JoinColumn(name="post_id")},
            inverseJoinColumns = {@JoinColumn(name="tag_id")}
    )
    private List<Tag> tags;

    public Post(){}

    public Post(long id, String title, String post) {
        this.id= id;
        this.title = title;
        this.post = post;
    }

        public Post(long id, String title, String post, User parentUser) {
        this.id= id;
        this.title = title;
        this.post = post;
        this.parentUser = parentUser;
    }
//
////    Enter parent constructor
//    public Post(String title, String post ) {
//        this.title = title;
//        this.post = post;
//    }
//
//    public Post() {}



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

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
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
