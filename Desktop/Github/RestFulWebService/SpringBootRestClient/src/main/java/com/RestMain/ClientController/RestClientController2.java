package com.RestMain.ClientController;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class RestClientController2 {

	
	@RequestMapping(value="/findStudentById", method = RequestMethod.GET)
	public ModelAndView findStudentDetailsByClient(@RequestParam("id") Long id){
		
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8443/rest/JerseyStudents/Details/"+id);
		Object response = target.request(MediaType.APPLICATION_JSON).get(Object.class);
		
		ModelAndView model = new ModelAndView();
		model.addObject("studentList", response);
		model.setViewName("NewFile2");
		
		return model;	
	}
	
	@RequestMapping(value="/createProfile", method = RequestMethod.POST)
	public ModelAndView createStudentDetailsByClient(@RequestParam("fname") String fname,
													@RequestParam("lname") String lname,
													@RequestParam("universityName") String universityName){
	
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8443/rest/JerseyStudents/addProfile");
		Form form =new Form();
        form.param("fname", fname);
        form.param("lname",lname);
        form.param("universityName",universityName);
        Response response = target.request().post(Entity.entity(form,MediaType.APPLICATION_FORM_URLENCODED),Response.class);
        System.out.println("Form response " + response.getStatus());
		
		
		
		//1St Method is not working. Try to fix.!!
		
//		Client client = ClientBuilder.newClient();
//		WebTarget target = client.target("http://localhost:8443/rest/JerseyStudents/addProfile");
//		MultivaluedMap<String, String> formData = new MultivaluedHashMap<String, String>();
//		    formData.add("fname", "value1");
//		    formData.add("lname", "value2");
//		    formData.add("universityName", "value2");
//		target.request(MediaType.APPLICATION_FORM_URLENCODED_TYPE).post(Entity.form(formData));

		
		//2nd Method is also not working. Try to fix.!!
		
//		ClientConfig config = new DefaultClientConfig();
//		Client client2 = Client.create(config);
//		WebResource webResource = client2.resource(UriBuilder.fromUri('http://localhost:8443/rest/JerseyStudents/addProfile').build());
//		MultivaluedMap formData = new MultivaluedMapImpl();
//		formData.add("fname", fname);
//		formData.add("lname", lname);
//		ClientResponse response = webResource.type(MediaType.APPLICATION_FORM_URLENCODED_TYPE).post(ClientResponse.class, formData);
//		System.out.println("resopnse" + response.getEntity(String.class));

		
		
		ModelAndView model = new ModelAndView();
		model.setViewName("Profile");
		
		return model;	
	}
	
	@RequestMapping(value="/deleteStudentById", method = RequestMethod.GET)
	public ModelAndView deleteStudentDetailsByClient(@RequestParam("id") Long id){
		
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8443/rest/JerseyStudents/deleteProfile/"+id);
		target.request().delete();
		
		ModelAndView model = new ModelAndView();
		model.setViewName("Profile");
		
		return model;	
	}
}
