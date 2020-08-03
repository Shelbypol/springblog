package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RollDiceController {

    @GetMapping("/roll-dice")
    public String diceGame() {
        return "rolldice";
    }

    @PostMapping
    public String num(@RequestParam(name = "num") String num, Model model) {
        int randNum = 0;
        for(int i = 1; i < 6; i++) {
            randNum = (int) (Math.random() * 5) + 1;
        }
        model.addAttribute("dieRoll", randNum);
        model.addAttribute("userGuess", num);

        return "rolldice";

    }


}