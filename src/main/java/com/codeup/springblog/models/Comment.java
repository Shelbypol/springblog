package com.codeup.springblog.models;

import javax.persistence.*;

@Entity
@Table(name = "comments")
public class Comment {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;

    private String content;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post parentPost;


    public Comment() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Post getParentPost() {
        return parentPost;
    }

    public void setParentPost(Post parentPost) {
        this.parentPost = parentPost;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + content + '\'' +
                ", post='" + parentPost + '\'' +
                '}';
    }
}
