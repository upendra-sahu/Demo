package com.example.demo.controller;



import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

	@RequestMapping(value = "/greeting/{name}", method = RequestMethod.GET)
	public String sayHello(@PathVariable String name) {
		return "hello  "+name;

	}
	
	

}
