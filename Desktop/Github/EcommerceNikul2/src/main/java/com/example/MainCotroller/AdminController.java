/**
 * 
 */
package com.example.MainCotroller;



import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.example.AdminInterfaces.AdminInterface;
import com.example.AdminModel.AdminSignUp;



/**
 * @author Nikul
 *
 */

@Controller
@PropertySource("classpath:application.properties")
public class AdminController {
	
	Logger log = Logger.getLogger(this.getClass());
	@Autowired
	public AdminSignUp AdminReg;
	@Autowired
	public AdminInterface adi;
	
	
	@RequestMapping("/EcommAdminLoginHere")
	public String AdminloginPage(){
		return "AdminLogin";
	}
	@RequestMapping("/Ecomm2Sign")
	public String AdminSignupPage(ModelMap model){
		
		model.addAttribute("AdminSignUp", AdminReg);
		return "AdminSignup";
	}
	@RequestMapping(value="/EmpRegistration", method=RequestMethod.POST)
	public String InsertAdminDetails(@ModelAttribute("AdminSignUp") AdminSignUp use, BindingResult result, Model model){
		
		
		
		adi.EmployeeRegistration(use);
		System.out.println("hellolllll");
		return "AdminHome";
	}
	
//	@RequestMapping(value="/EmpRegistration", method=RequestMethod.POST)
//	public String InsertAdminDetails(@RequestParam String username, @RequestParam char[] password, @RequestParam String email, @RequestParam String roles, @RequestParam String Aname,@RequestParam Boolean enabled){
//		log.info(username +" "+"firstName");
//		System.out.println(password);
//		System.out.println(roles);
//		String[] abcd=roles.split(",");
//		System.out.println(abcd[0]);
//		System.out.println(abcd[1]);
//		System.out.println(enabled);
//		//System.out.println(id);
//		
////		
////		AdminReg.setAname(Aname);
////		AdminReg.setEmail(email);
////		AdminReg.setPassword(password);
////		AdminReg.setUsername(username);
////		AdminReg.setEnabled(true);
////		
//////		AdminRoles a1= new AdminRoles();
//////		a1.setRoleName(abcd[0]);
//////		a1.setUsers(AdminReg);
//////		AdminRoles a2= new AdminRoles();
//////		a2.setRoleName(abcd[1]);
//////		AdminRoles a3= new AdminRoles();
//////		a3.setRoleName(abcd[2]);
//////		AdminRoles a4= new AdminRoles();
//////		a4.setRoleName(abcd[3]);
//////		
//////	
//////		Set<AdminRoles> roles1 = new HashSet<AdminRoles>();
//////		roles1.add(a1);
//////		roles1.add(a2);
//////		roles1.add(a3);
//////		roles1.add(a4);
//////		
////		
////		//AdminReg.setRoles(roles1);
////		adi.EmployeeRegistration(AdminReg);
//		
//		return "redirect:/AdminHome";
//	}
	

}
