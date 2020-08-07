package com.codeup.springblog.controllers;

import com.codeup.springblog.models.Comment;
import com.codeup.springblog.models.Post;
import com.codeup.springblog.models.User;
import com.codeup.springblog.repositories.CommentRepository;
import com.codeup.springblog.repositories.PostRepository;
import com.codeup.springblog.repositories.UserRepository;
import com.codeup.springblog.services.EmailService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PostController {

    //    dependency injection
    private final PostRepository postsDao;
    private final UserRepository userDao;
    private final CommentRepository commentDao;
    private final EmailService emailService;

    public PostController(PostRepository postsDao, UserRepository userDao, CommentRepository commentDao) {
        this.postsDao = postsDao;
        this.userDao = userDao;
        this.commentDao = commentDao;
    }

    //  ALL POSTS
    @GetMapping("/posts")
    public String postsIndexPage(Model model) {

        List<Post> myPost = postsDao.findAll();
        model.addAttribute("posts", myPost);
        return "posts/index";
    }


    //  IND POST VIEW && GET COMMENTS
    @GetMapping("/posts/show/{id}")
    public String indPostPage(@PathVariable(value = "id") long id, Model model) {
        Post indPost = postsDao.getOne(id);
        List<Comment> getComments = postsDao.getOne(id).getComments();

        model.addAttribute("comments", getComments);
        model.addAttribute("post", indPost);

        return "posts/show";
    }

    //  CREATE COMMENT
    @PostMapping("/posts/show/{id}/comment")
    public String getPost(@PathVariable(value = "id") long id, @RequestParam(name = "createComment") String createComment) {
        Post post = postsDao.getOne(id);
        Comment comment = new Comment();
        comment.setContent(createComment);
        comment.setParentPost(post);
        commentDao.save(comment);

        return "redirect:/posts/show/" + id;
    }

    //        DELETE POST
    @PostMapping("/posts/show/{id}")
    public String deletePost(@RequestParam(name = "deleteBtn") long id) {
        postsDao.deleteById(id);

        return "redirect:/posts";
    }

    //      EDIT POST
    @GetMapping("posts/edit/{id}")
    public String editPost(@PathVariable long id, Model model) {
        Post indPost = postsDao.getOne(id);
        model.addAttribute("post", indPost);

        return "posts/edit";
    }

    @PostMapping("/posts/edit/{id}")
    public String editPost(@PathVariable long id,
                           @RequestParam(name = "titleEdit") String titleUpdate,
                           @RequestParam(name = "postEdit") String postUpdate) {
        System.out.println("edit");
        Post post = postsDao.getOne(id);
        post.setTitle(titleUpdate);
        post.setPost(postUpdate);
        postsDao.save(post);

        return "redirect:/posts/show/" + id;

    }

    //  CREATE POST
    @GetMapping("/posts/create")
    public String createPost() {
        return "posts/create";
    }

    //  CREATE POST
    @PostMapping("/posts/create")
    public String getPost(@RequestParam(name = "createTitle") String createTitle,
                          @RequestParam(name = "createBody") String createBody) {
        User user = userDao.getOne(1L);
        Post post = new Post();
        post.setTitle(createTitle);
        post.setPost(createBody);
        post.setParentUser(user);
        postsDao.save(post);

        return "redirect:/posts";
    }

// Register User
    @GetMapping("users/create")
    public String showRegisterForm(Model model){
        model.addAttribute("user", new User());

        return "users/create";
    }

    @PostMapping("users/create")
    public String createUser(@ModelAttribute User user){
        userDao.save(user);
        return "redirect:/posts";
    }






    //  SAVE POST
//    @GetMapping("posts/save")
//    public String save() {
//        Post postToSave = new Post();
//        postToSave.setTitle();
//        postToSave.setPost();
//        postsDao.save(postToSave);
//        return "redirect:/posts";
//    }

    //  FIND POST
//    @GetMapping("posts/test")
//    @ResponseBody
//    public String getTestPost() {
//        return postsDao.findByTitle("Barneys").toString();
//    }


}
