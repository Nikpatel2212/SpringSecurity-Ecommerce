package com.example.Controller;

import java.io.IOException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.example.Dao.Student;
import com.example.Dao.StudentRepoFinal;

// Producing web services using Jersey API

@Component
@Path("/JerseyStudents")
public class StudentProducer {

	@Autowired
	private StudentRepoFinal srt;
	
	
	private static final String SUCCESS_RESULT="{\"success\":1}";
	private static final String FAILURE_RESULT="{\"success\":0}";
	
	@GET
	@Path("/profile")
	@Produces(MediaType.APPLICATION_JSON )
	public List<Student> getAllStudents(){
		System.out.println("Nikullll");  
		return srt.findAll();
	}
	@GET
	@Path("/profile/XML")
	@Produces(MediaType.APPLICATION_XML )
	public List<Student> getAllStudentsXML(){
		System.out.println("Nikullll");  
		return srt.findAll();
	}
	
	@GET
	@Path("/Details/{id}")
	@Produces(MediaType.APPLICATION_JSON )
	public Student getOnestudent(@PathParam("id") Long id){
		System.out.println("oooo");  
		return srt.findOne(id);
	}
	
	@GET
	@Path("/Details")
	@Produces(MediaType.APPLICATION_JSON )
	public Student getOneStudents1(@QueryParam("id") Long id){
		
		return srt.findOne(id);
	}
	
	@POST
	@Path("/addProfile")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String createProfile(@FormParam("fname") String fname,
		      				@FormParam("lname") String lname,
		      				@FormParam("universityName") String universityName) throws IOException{
		
			  Student student= new Student();
		      student.setFname(fname);
		      student.setLname(lname);
		      student.setUniversityName(universityName);
		      Object result = srt.save(student);
		      if(result != null){
		         return SUCCESS_RESULT;
		      }
		      return FAILURE_RESULT;
	}
	
	@DELETE
	@Path("/deleteProfile/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public String deleteProfile(@PathParam("id") Long id){
	      srt.delete(id);
	      return SUCCESS_RESULT;
	}
	
	
}
