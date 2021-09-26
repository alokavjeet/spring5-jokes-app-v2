package com.springframework.spring5jokesappv2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springframework.spring5jokesappv2.services.JokeService;

@Controller
public class RandomJokeController {
	private final JokeService jokeService;
	
	public RandomJokeController(JokeService jokeService) {
		this.jokeService = jokeService;
	}
	
	public String getRandomQuote() {
		return jokeService.getRandomQuote();
	}
	
	@RequestMapping({"/",""})
	public String showJoke(Model model) {
		model.addAttribute("joke",getRandomQuote());
		return "index";
	}

}
