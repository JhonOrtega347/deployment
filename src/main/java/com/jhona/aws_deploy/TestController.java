package com.jhona.aws_deploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  @GetMapping("/")
  public String health() {
    return "Hello Geeks And Welcome to GeekForGeeks !!!";
  }
}