package com.codeup.springblog.controllers;

import com.codeup.springblog.services.CountService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ServiceTestController {

    private CountService countSvc;

    public ServiceTestController(CountService countSvc) {
        this.countSvc = countSvc;
    }

    @GetMapping("/count")
    @ResponseBody
    public int countChar(){
        return (countSvc.totalPostChar());
    }


//    @GetMapping("/morning/{name}")
//        @ResponseBody
//        public String morningGreeting (@PathVariable String name){
//            return greetingSvc.goodMorning(name);
//        }
//
//
//    @GetMapping("/afternoon/{name}")
//        @ResponseBody
//        public String afternoonGreeting (@PathVariable String name){
//            return greetingSvc.goodAfternoon(name);
//        }
//
//
//    @GetMapping("/evening/{name}")
//        @ResponseBody
//        public String morningEvening (@PathVariable String name){
//        return greetingSvc.goodEvening(name);
//        }



}
