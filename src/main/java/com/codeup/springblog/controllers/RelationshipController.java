//package com.codeup.springblog.controllers;
//
//import com.codeup.springblog.models.Post;
//import com.codeup.springblog.repositories.PostRepository;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import java.util.List;
//
//@Controller
//public class RelationshipController {
//    //    dependency injection
//    private final PostRepository postsDao;
//
//    public RelationshipController(PostRepository postsDao) {
//        this.postsDao = postsDao;
//    }
//
//    //  ALL POSTS
//    @GetMapping("/rel/posts")
//    @ResponseBody
//    public List<Post> postsIndexPage() {
//        List<Post> posts = postsDao.findAll();
//        return postsDao.findAll();
////        model.addAttribute("posts", myPost);
//
////        return
//    }
//
//    @GetMapping("/rel/posts/view")
//    public String returnPostsView(Model model){
//        model.addAttribute("posts", postsDao.findAll());
//        return "relViewExample";
//    }
//
//
//}
