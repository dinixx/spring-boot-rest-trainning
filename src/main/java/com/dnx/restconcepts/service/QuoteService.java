package com.dnx.restconcepts.service;

import com.dnx.restconcepts.dto.Quote;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * QuoteService
 */
@Service
public class QuoteService {

  public Quote random() {
    RestTemplate restTemplate = new RestTemplate();
    return restTemplate.getForObject("https://programming-quotes-api.herokuapp.com/quotes/random", Quote.class);
  }
  
  
}