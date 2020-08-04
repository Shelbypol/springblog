package com.codeup.springblog.controllers;

import com.codeup.springblog.models.Post;
import com.codeup.springblog.repositories.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {

//    dependency injection
    private final PostRepository postsDao;
    //expand on constructor to inject both of them;

    public PostController(PostRepository postsDao){
        this.postsDao = postsDao;
    }

    @GetMapping("/posts")
    public String postsIndexPage( Model model){
        List<Post> myPost = postsDao.findAll();
        model.addAttribute("posts", myPost);

        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String indPostPage(@PathVariable long id, Model model){
        Post indPost = postsDao.getOne(id);

        model.addAttribute("title", indPost.getTitle());
        model.addAttribute("body", indPost.getPost());

        return "posts/show";
    }

    @GetMapping("posts/save")
    public String save(){
        Post postToSave = new Post();
        postToSave.setTitle("new add");
        postToSave.setPost("updated post");
        postsDao.save(postToSave);
        return "redirect:/posts";
    }

    @GetMapping("posts/test")
    @ResponseBody
    public String getTestPost(){
        return postsDao.findByTitle("Barneys").toString();
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

    private class findById extends Post {
        public findById(long id) {
        }
    }
}
