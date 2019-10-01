package com.dnx.restconcepts.controller;

import com.dnx.restconcepts.dto.Quote;
import com.dnx.restconcepts.service.QuoteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * QuoteController
 */
@RestController
@RequestMapping("/quotes")
@Api(tags = "Quotes", description = "Demo Quote Rest API")
public class QuoteController {

  @Autowired
  QuoteService quoteService;

  @GetMapping("/random")
  @ApiOperation(produces = "application/json", protocols = "http", value = "ramdon")
  public Quote random() {
    return quoteService.random();
  }

  @GetMapping("/{id}")
  @ApiOperation(produces = "application/json", protocols = "http", value = "getQuote")
  @ApiResponses(value = { @ApiResponse(code = 200, message = "Success!") })
  public Quote getQuote(@ApiParam("Id of quote, can not be null") @PathVariable int id) {
    Quote quote = new Quote();
    quote.setAuthor("to be done");
    return quote;
  }

}