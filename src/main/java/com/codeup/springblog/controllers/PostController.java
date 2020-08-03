package com.codeup.springblog.controllers;

import com.codeup.springblog.models.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class PostController {


    @GetMapping("/posts")
    public String postsIndexPage( Model model){
        ArrayList<Post> myPost = new ArrayList<Post>();
        myPost.add(new Post(1, "new title 1", "new post"));
        myPost.add(new Post(2, "new title 2", "new post"));
        myPost.add(new Post(3, "new title 3", "new post"));

        model.addAttribute("posts", myPost);
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String indPostPage(@PathVariable int id, Model model){
        Post indPost = new Post("new title hc", "new post");
//        model.addAttribute("title", indPost.getTitle());
//        model.addAttribute("body", indPost.getBody());
        model.addAttribute("indPost", indPost);
        return "posts/show";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String createPost(){
        return "Create post";
    }

    @PostMapping("/post/create")
    @ResponseBody
    public String getPost(){
        return null;
    }

}
