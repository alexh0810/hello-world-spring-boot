package com.example.helloworld.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@ResponseBody
public class HelloController {

    @RequestMapping("/")
    public @ResponseBody String greeting() {
        return "Hello World";
        
    }
    
    @RequestMapping("/index")
    public @ResponseBody String index() {
        return "This is the main page";
        
    }
    
    @RequestMapping("/contact")
    public @ResponseBody String contact() {
        return "This is the contact page";
        
    }
    
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(@RequestParam(name="name") String firstName, @RequestParam(name="location") String location) {
        return "Welcome to the " + location + " " + firstName;
        
    }
// https://github.com/alexh0810 
}