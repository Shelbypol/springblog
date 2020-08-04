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

    @GetMapping("/posts")
    public String postsIndexPage( Model model){
        List<Post> myPost = postsDao.findAll();
        model.addAttribute("posts", myPost);

        return "posts/index";
    }

    @GetMapping("/posts/show/{id}")
    public String indPostPage(){

        return "posts/show";
    }

    @PostMapping("/posts/show/{id}")
    public String indPost(@RequestParam(name = "view") long id, Model model) {
        Post indPost = postsDao.getOne(id);

        model.addAttribute("title", indPost.getTitle());
        model.addAttribute("body", indPost.getPost());
        return "show";
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
