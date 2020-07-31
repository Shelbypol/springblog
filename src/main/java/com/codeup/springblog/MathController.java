package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {


    @GetMapping("/{thing}/{num1}/and/{num2}")
    @ResponseBody
    public String mathFun(@PathVariable String thing, @PathVariable int num1, @PathVariable int num2) {
        if (thing.equalsIgnoreCase("add") || thing.equalsIgnoreCase("+")) {
            String style = "<body style = background-color:yellow>";
            int answer = num1 + num2 ;
            return "<h1 style=text-align:center;>"+ num1 + "<i> + </i> " + num2 + " = " + answer + "</h1>" +style;
        } else if (thing.equalsIgnoreCase("minus") || thing.equalsIgnoreCase("-")) {
            String style = "<body style=background-color:red;>";
            int answer = num1 - num2;
            return "<h1 style=text-align:center;>"+num1 + " - " + num2 + " = " + answer + "</h1>" +style;
        } else if (thing.equalsIgnoreCase("multiply") || thing.equalsIgnoreCase("x")) {
            String style = "<body style=background-color:blue;>";
            int answer = num1 * num2;
            return "<h1 style=text-align:center;>"+num1 + " * " + num2 + " = " + answer + "</h1>" +style;
        } else if (thing.equalsIgnoreCase("divide") || thing.equalsIgnoreCase("/")) {
            String style = "<body style=background-color:purple;";
            int answer = num1 / num2;
            return "<h1 style=text-align:center;>"+num1 + " / " + num2 + " = " + answer + "</h1>" +style;
        } else if (thing.equalsIgnoreCase("modulus") || thing.equalsIgnoreCase("%")) {
            String style = "<body style=background-color:green;>";
            int answer = num1 % num2;
            return "<h1 style=text-align:center;>"+num1 + " % " + num2 + " = " + answer + "</h1>" +style;
        } else {
            return "whatever, who likes math anyways";
        }
    }
}


