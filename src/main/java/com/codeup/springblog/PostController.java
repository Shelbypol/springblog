package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    @GetMapping("/posts")
    @ResponseBody
    public String postsIndexPage(){
        return "Posts Page";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String indPostPage(@PathVariable int id){
        return "Posts id is " + id;
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
