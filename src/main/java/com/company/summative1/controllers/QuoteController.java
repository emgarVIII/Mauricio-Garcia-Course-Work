package com.company.summative1.controllers;

import com.company.summative1.modules.Quote;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
@RestController
public class QuoteController {

    private List<String> quotes = new ArrayList<>();
    private static int currId = 0;

    public QuoteController() {
        quotes.add("What doesn't kill you makes you stronger.-Kelly Clarkson");
        quotes.add("What goes around comes around.-Eddie Stone");
        quotes.add("A man of words and not of deeds is like a garden full of weeds.-Percy Green");
        quotes.add("Life is like a trumpet. If you don't put anything into it, you don't get anything out.-William Christopher Handy");
        quotes.add("Unable are the loved to die for love is immortality.–Emily Dickinson");
        quotes.add("Hard work outweighs talent — every time.-Kobe Bryant");
        quotes.add("All art is a kind of confession.-James Baldwin");
        quotes.add("If life were predictable it would cease to be life, and be without flavor.-Eleanor Roosevelt");
        quotes.add("Never let the fear of striking out keep you from playing the game.-Babe Ruth");
        quotes.add("The question isn't who is going to let me; it's who is going to stop me.-Ayn Rand");
    }

    @RequestMapping(value="/quote", method = RequestMethod.GET)
    @ResponseStatus(value= HttpStatus.OK)
    public Quote getQuote() {

        Random random = new Random();
        int ind = random.nextInt(quotes.size());  //randomly picks a quote

        String[] parts = quotes.get(ind).split("-");  // each element in quotes is quote-author format
        Quote q = new Quote(currId++, parts[1], parts[0]);

        return q;

    }
}
