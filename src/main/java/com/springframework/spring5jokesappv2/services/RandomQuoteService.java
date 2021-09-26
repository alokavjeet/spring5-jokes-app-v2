package com.springframework.spring5jokesappv2.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class RandomQuoteService implements JokeService {
	private final ChuckNorrisQuotes chuckNorrisQuotes;

	public RandomQuoteService() {
		this.chuckNorrisQuotes = new ChuckNorrisQuotes();
	}

	@Override
	public String getRandomQuote() {
		return chuckNorrisQuotes.getRandomQuote();
	}

}
