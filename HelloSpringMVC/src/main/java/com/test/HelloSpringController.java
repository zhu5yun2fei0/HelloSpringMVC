package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

 
@Controller

public class HelloSpringController {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    @ResponseBody
   // @CrossOrigin(origins = "http://localhost:8082")
    public String lo() {
    	System.out.println("½øÀ´ÁË");
    	return "hello";
    }
}