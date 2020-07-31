package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.Time;

@Controller
class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello from Spring!";
    }

//    @GetMapping("/hello{name}")
//    @ResponseBody
//    public String hello() {
//        return "Hello " + name;
//    }

    @GetMapping("/goodbye")
    @ResponseBody
    public String goodbye() {
        return "Goodbye from Spring!";
    }

    @RequestMapping(path = "/hello/{name}", method = RequestMethod.GET)
    @ResponseBody
    public String hello(@PathVariable String name) {
        return "Hello " + name;
    }

    @GetMapping("/books/{id}")
    @ResponseBody
    public String getBook(@PathVariable long id){
        if(id == 1){
            return "<h4> Book: Green Eggs and Ham </h4>";
        }else {
            return "Book: Game of thrones";
        }
    }

    @GetMapping("/color/{color}")
    @ResponseBody
    public String getColor(@PathVariable String color){
        if(color.equalsIgnoreCase("black")){
            return "<body style=background-color:black;>";
        }else  if(color.equalsIgnoreCase("red")){
            return "<body style=background-color:red;>";
        }else  if(color.equalsIgnoreCase("green")){
            return "<body style=background-color:green;>";
        } else  if(color.equalsIgnoreCase("purple")){
            return "<body style=background-color:purple;>";
        } else  if(color.equalsIgnoreCase("blue")){
            return "<body style=background-color:blue;>";
        }else  if(color.equalsIgnoreCase("yellow")){
            return "<body style=background-color:yellow;>";
        }else{
            return "<body style=background-color:white;>";
        }
    }

}
