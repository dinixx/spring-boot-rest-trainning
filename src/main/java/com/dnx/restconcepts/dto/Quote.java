package com.dnx.restconcepts.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Quote
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {
  private String _id;
  private String en;
  private String br;
  private String author;

  public String get_id() {
    return _id;
  }

  public void set_id(String _id) {
    this._id = _id;
  }

  public String getEn() {
    return en;
  }

  public void setEn(String en) {
    this.en = en;
  }

  public String getBr() {
    return br;
  }

  public void setBr(String br) {
    this.br = br;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

}