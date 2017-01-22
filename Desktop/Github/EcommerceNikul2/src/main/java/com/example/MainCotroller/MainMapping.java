package com.example.MainCotroller;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@PropertySource("classpath:application.properties")
public class MainMapping {
	
	@RequestMapping("/welcome")
	public String homePage(){
		return "IndexEcommerce";
	}
	@RequestMapping("/ADMNwelcome99")
	public String ADMINhomePage(){
		return "AdminHome";
	}
	@RequestMapping("/EcommSign")
	public String EcommerceSignUp(){
		return "UserSignup";
	}
	
	@RequestMapping("/Error403")
	public String EcommErrorPage(){
		return "Error";
	}
	@RequestMapping("/contact1")
	public String EcommContactPage(){
		return "EcommContact";
	}
	@RequestMapping("/help1")
	public String EcommHelpPage(){
		return "EcommHelp";
	}
	
}
