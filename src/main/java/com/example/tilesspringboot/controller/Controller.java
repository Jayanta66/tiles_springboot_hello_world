package com.example.tilesspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
	
	@GetMapping({"/","index"})
	public String homeview() {
		return "index";
		}
	


}
