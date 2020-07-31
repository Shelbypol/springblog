package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class ProfileController {

    @GetMapping("/profile/{username}")
    public String viewProfile(@PathVariable String username, Model model){
        String str = username;
        String capUsername = str.substring(0, 1).toUpperCase() + str.substring(1);
        model.addAttribute("user", capUsername);
        return "profile";
    }

    @GetMapping("/profile")
        public String viewProfile(){
            return "profile";
        }



    @PostMapping("/profile")
    public String cohort(@RequestParam(name = "loginName") String userName, @RequestParam(name = "loginPassword") String userPassword , Model model){

        ArrayList<String> ads = new ArrayList<String>();
        ads.add("Ad 1");
        ads.add("Ad 2");
        ads.add("Ad 3");

        boolean isLoggedIn = true;

        model.addAttribute("username", userName);
        model.addAttribute("userPassword", userPassword);
        model.addAttribute("ads", ads);
        model.addAttribute("isLoggedIn", isLoggedIn);

        return "profile";
    }
}
