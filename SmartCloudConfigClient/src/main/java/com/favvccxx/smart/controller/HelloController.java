package com.favvccxx.smart.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Value("${smart.from}")
    private String hello;

    @RequestMapping("/hello")
    public String from() {
        return "您好，我是来自" + this.hello + "的问候";
    }

}
