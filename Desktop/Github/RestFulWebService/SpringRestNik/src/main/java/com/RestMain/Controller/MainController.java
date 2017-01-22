package com.RestMain.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.RestMain.Domain.Student;
import com.RestMain.dao.StudentRepoImpl;

@Controller
public class MainController {
	
	@Autowired
	private StudentRepoImpl str;
	
	@RequestMapping(value="/home")
	public String homePage(Model mr){
		  
		mr.addAttribute("student", str.findAll());
		return "Welcome";
	}
	
	@RequestMapping(value="/addStudent")
	public String addNewStudent(@ModelAttribute Student st){
		str.save(st);
		return "redirect:/home";
	}
	
}
