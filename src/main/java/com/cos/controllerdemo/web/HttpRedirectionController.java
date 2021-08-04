package com.cos.controllerdemo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HttpRedirectionController {	
	
	@GetMapping("/home") 
	public String home(){
		return "home";
	}
	@GetMapping("/away") 
	public String away(){
		return "redirect:/home";//리다이렉션이 된다 @Controller
	}
	
}
