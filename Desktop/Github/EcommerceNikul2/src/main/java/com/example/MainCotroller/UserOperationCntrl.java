package com.example.MainCotroller;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.CustomerModel.UserSignup;
import com.example.CustomerService.EcommAppSecurity;
import com.example.Customerinterface.CstmrInterface;


@Controller
@PropertySource("classpath:application.properties")
public class UserOperationCntrl {
	
	Logger log = Logger.getLogger(this.getClass());
	
	@Autowired
	public UserSignup urs;
	@Autowired
	public CstmrInterface cdao;
	@Autowired
	public EcommAppSecurity ecoApp;
	
	@RequestMapping( value = "/newUser", method=RequestMethod.POST)
	public String  inserUser(@RequestParam String username, @RequestParam char[] password, @RequestParam String email, @RequestParam String firstName ){
		log.info(username +" "+"firstName");
		
		
		urs.setEmail(email);
		urs.setName(firstName);
		urs.setEnabled(true);

		urs.setPassword(password);
		urs.setUsername(username);
		cdao.CustomerSignup(urs);
		String pass2 = String.valueOf(urs.getPassword());
		ecoApp.autologin(urs.getUsername(), pass2);
		return "redirect:/IndexEcommerce";
		
		
		//Ud.save(usermodel);
		//urModel.setFirstName(firstName);
		//urModel.setUserName(username);
		//Ud.save(urModel);
		
		
		
	}
	@RequestMapping("/login1")
	public String EcommerceSignUp1(){
		return "UserLogin";
	}

}
