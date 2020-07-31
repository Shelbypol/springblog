package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {


    @GetMapping("/{thing}/{num1}/and/{num2}")
    @ResponseBody
    public String MathContoller(@PathVariable String thing, @PathVariable int num1, @PathVariable int num2) {
        if (thing.equalsIgnoreCase("add") || thing.equalsIgnoreCase("+")) {
            int answer = num1 + num2;
            return num1 + " + " + num2 + " = " + answer;
        } else if (thing.equalsIgnoreCase("minus") || thing.equalsIgnoreCase("-")) {
            int answer = num1 - num2;
            return num1 + " - " + num2 + " = " + answer;
        } else if (thing.equalsIgnoreCase("multiply") || thing.equalsIgnoreCase("x")) {
            int answer = num1 * num2;
            return num1 + " * " + num2 + " = " + answer;
        } else if (thing.equalsIgnoreCase("divide") || thing.equalsIgnoreCase("/")) {
            int answer = num1 / num2;
            return num1 + " / " + num2 + " = " + answer;
        } else if (thing.equalsIgnoreCase("modulus") || thing.equalsIgnoreCase("%")) {
            int answer = num1 % num2;
            return num1 + " % " + num2 + " = " + answer;
        } else {
            return "whatever, who likes math anyways";
        }
    }
}


