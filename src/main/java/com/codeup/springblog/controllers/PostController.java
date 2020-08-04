package com.codeup.springblog.controllers;

import com.codeup.springblog.models.Post;
import com.codeup.springblog.repositories.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {

//    dependency injection
    private final PostRepository postsDao;

    public PostController(PostRepository postsDao){
        this.postsDao = postsDao;
    }

//  ALL POSTS
    @GetMapping("/posts")
    public String postsIndexPage( Model model){
        List<Post> myPost = postsDao.findAll();
        model.addAttribute("posts", myPost);

        return "posts/index";
    }
//  IND POST VIEW
    @GetMapping("/posts/show/{id}")
    public String indPostPage(@PathVariable(value = "id") long id, Model model){
        Post indPost = postsDao.getOne(id);

        model.addAttribute("title", indPost.getTitle());
        model.addAttribute("body", indPost.getPost());
        return "posts/show";
    }

//  SAVE POST
    @GetMapping("posts/save")
    public String save(){
        Post postToSave = new Post();
        postToSave.setTitle("new add");
        postToSave.setPost("updated post");
        postsDao.save(postToSave);
        return "redirect:/posts";
    }

//  FIND POST
    @GetMapping("posts/test")
    @ResponseBody
    public String getTestPost(){
        return postsDao.findByTitle("Barneys").toString();
    }

//  CREATE POST
    @GetMapping("/posts/create")
    @ResponseBody
    public String createPost(){
        return "Create post";
    }
//  CREATE POST
    @PostMapping("/posts/create")
    @ResponseBody
    public String getPost(){
        return null;
    }



//    @PostMapping("/posts/index")
////    @ResponseBody
//    public String deletePost(@RequestParam(name = "deleteBtn") long id){
//        postsDao.deleteById(id);
//
//        return "index";
//    }

}
