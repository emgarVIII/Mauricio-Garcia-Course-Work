package com.company.summative1.controllers;

import com.company.summative1.modules.Answer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class magicController {
    private List<String> AnswerPrompts = new ArrayList<>();
    private static int currId = 0;

    public magicController(){
        AnswerPrompts.add("Yes");
        AnswerPrompts.add("Maybe?");
        AnswerPrompts.add("NO!!!");
        AnswerPrompts.add("I don't think so...");
        AnswerPrompts.add("Sure, why not");
        AnswerPrompts.add("umm... probably");
        AnswerPrompts.add("No clue!");
        AnswerPrompts.add("You better not");
        AnswerPrompts.add("Hard no.");
        AnswerPrompts.add("Go ahead!");
    }

    @RequestMapping(value = "/magic", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Answer getRandomAnswer (@RequestBody @Valid Answer question){
        //Answer response = new Answer();

        Random random = new Random();
        int index = random.nextInt(AnswerPrompts.size());

        question.setId(currId++);
        //response.setQuestion(question);
        //response.setQuestion(question.getQuestion());
        question.setAnswer(AnswerPrompts.get(index));

        return question;
    }

}
