package com.dnx.restconcepts.controller;

import com.dnx.restconcepts.dto.Quote;
import com.dnx.restconcepts.service.QuoteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * QuoteController
 */
@RestController
@RequestMapping("/quotes")
public class QuoteController {

  @Autowired
  QuoteService quoteService;

  @GetMapping("/random")
  public Quote random() {
    return quoteService.random();
  }

}