package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Dao.Student;
import com.example.Dao.StudentRepoFinal;

//Producing Rest web service using Spring MVC mean using @Restcontroller
//If Any method is not working then please check or make sure with Postman or any other tool. 

@RestController
@RequestMapping(value="/SpringStudents")
public class StudentProducer2 {
	
	@Autowired
	private StudentRepoFinal srt;
	

	@RequestMapping(value="/profiles")
	public List<Student> getAllStudents(){
		System.out.println("Nikullll");  
		return srt.findAll();
	}
	
	@RequestMapping(value="/Details/{id}", method = RequestMethod.GET)
	public Student getOnestudent(@PathVariable("id") Long id){
		System.out.println("oooo");  
		return srt.findOne(id);	
	}
	
	@RequestMapping(value="/Details", method = RequestMethod.GET)
	public Student getOneStudents1(@RequestParam("id") Long id){
	
		return srt.findOne(id);
	}
	

}
