package com.jmurphey.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller // this was @RestController, changed to @Controller because we use JSP file
@RequestMapping("/")
public class HomeController {
	
	@RequestMapping("")
	public String hello(@RequestParam(value="q", required=false) String search, Model model) {
		model.addAttribute("search", search);
		model.addAttribute("firstName", "Kevin");
		model.addAttribute("stack", "Java");
		return "index.jsp";
	} //  it appears that %20 and + both allow for chaining of words in a request from url
	
	@RequestMapping("/users/{name}")
	public String showName(@PathVariable("name") String userName, Model model) {
		model.addAttribute("userName", userName);
		return "index.jsp";
	}
	
	// The methods below no longer work since I now have @Controller, instead of @RestController. Need @Controller to run .jsp file
	@RequestMapping("/java")
	public String helloJava() {
		return "Java what! java java lava java";
	}
	
	// the method below allows for us to pass a parameter thru the URL, then grab and display it. 
	@RequestMapping("/welcome")
	public String helloWelcome(@RequestParam(value="q") String searchQuery) {
		// to pass the value we type /welcome?q=Jackson ... If you want to add a space use %20, so Jackson%20Murphey
		return "Welcome to Java, " + searchQuery;
	}
}
