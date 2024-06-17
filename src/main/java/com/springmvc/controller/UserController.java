package com.springmvc.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.springmvc.dto.Join;

@Controller
public class UserController {

	
	@GetMapping("/myPage")
	public String myPage(){
		
		return "user/mypage";
	}
	
	@GetMapping("/login")
	public String login(){
				
		return "user/login";
	}
	
	@GetMapping("/join")
	public String join() {
	    return "user/join";
	}
	

	@PostMapping("/join")
	public String joinProc(@Valid Join join, BindingResult bindingResult, Model model) {
		System.out.println(join);
		if(bindingResult.hasErrors()) {
			System.out.println("에러");
			
			List<FieldError> list = bindingResult.getFieldErrors();
			Map<String, String> errorMsg = new HashMap<>();
			
			for(int i=0;i<list.size();i++) {
				String field = list.get(i).getField(); 
				String message = list.get(i).getDefaultMessage(); 
						
				System.out.println("필드 = " + field);
				System.out.println("메세지 = " +message);
				
				errorMsg.put(field, message);
			}
			model.addAttribute("errorMsg", errorMsg);
			return "user/join";
		}
		
		
		return "redirect:/login";
	}
	
	
}
