package com.codeup.springblog.services;

import com.codeup.springblog.models.Post;
import com.codeup.springblog.models.User;
import com.codeup.springblog.repositories.PostRepository;
import com.codeup.springblog.repositories.UserRepository;
import org.springframework.stereotype.Service;

//@Service("greetingService")
@Service
public class CountService {

//    public String goodMorning(String name){
//        return "Good Morning, " + name + "!";
//    }
//    public String goodAfternoon(String name){
//        return "Good Afternoon, " + name + "!";
//    }
//    public String goodEvening(String name){
//        return "Good Evening, " + name + "!";
//    }

    private PostRepository postDao;
    private UserRepository userDao;

    public CountService(PostRepository postDao, UserRepository userDao){
        this.postDao = postDao;
        this.userDao = userDao;
    }

    public int totalPostChar() {
        Iterable<Post> posts = postDao.findAll();
        Iterable<User> users  = userDao.findAll();
        int total = 0;
        for (Post post : posts) {
            total += post.getPost().length();
        }

//        int total = 0;
//        for (User user : users) {
//            total += user.getUsername().length();
//        }
//        return total;



        return total;
    }


}

