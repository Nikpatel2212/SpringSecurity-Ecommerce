package com.RestMain.ClientController;


import java.util.ArrayList;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SuppressWarnings("unchecked")
public class RestClientController {
	
		
	@RequestMapping(value="/clientHome")
	public String clientHomePage(){
		return "Profile";
	}
	
	@RequestMapping(value="/FindByAngular")
	public String findStudentDetailsByAngularJs(){
		return "NewFile1";
	}
	
	@RequestMapping(value="/FindByJersey", method = RequestMethod.GET)
	public ModelAndView findStudentDetailsByClient(){
		
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8443/rest/JerseyStudents/profile");
		List<Object> response = target.request(MediaType.APPLICATION_JSON).get(ArrayList.class);
		System.out.println("Getting Students Data By Jersey API (Client) :"+response);
		
		ModelAndView model = new ModelAndView();
		model.addObject("studentDetails", response);
		model.setViewName("NewFile");
		
		return model;	
	}
	
	@RequestMapping(value="/FindBySpring", method = RequestMethod.GET)
	public ModelAndView findStudentDetailsBySpring(){
		
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8443/rest/JerseyStudents/profile";
		List<Object> usersList = restTemplate.getForObject(url, List.class);
		System.out.println("Getting Students Data By Spring MVC (Rest Template) :"+usersList);
		
		ModelAndView model = new ModelAndView();
		model.addObject("studentDetails", usersList);
		model.setViewName("NewFile");
		
		return model;	
	}
	
	
}

