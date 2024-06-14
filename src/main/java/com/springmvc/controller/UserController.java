package com.springmvc.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class UserController {

	
	@GetMapping("/myPage")
	public String myPage(){
		
		
		return "user/mypage";
	}
	
	@GetMapping("/login")
	public String login(){
		
		
		return "user/login";
	}
	
	
}
