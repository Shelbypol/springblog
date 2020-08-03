package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class PostController {

//    @GetMapping("/posts")
//    @ResponseBody
//    public String posts(){ return "posts/index";}

    @GetMapping("/posts")
    public String postsIndexPage( Model model){
        ArrayList<String> ads = new ArrayList<String>();
        ads.add("Ad 1");
        ads.add("Ad 2");
        ads.add("Ad 3");

        model.addAttribute("ads", ads);
        return "posts/index";
    }

//    @GetMapping("/posts/{id}")
//    public String indPostPage(){ return "posts/show";}

    @GetMapping("/posts/{id}")
    public String indPostPage(@PathVariable int id, Model model){
        Post indPost = new Post("new title", "new post");
//        String idNew = toString("id");
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
