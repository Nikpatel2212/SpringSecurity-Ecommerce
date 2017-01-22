package com.example.AdminInterfaces;

import com.example.AdminModel.AdminSignUp;


public interface AdminInterface {
	
	public void EmployeeRegistration(AdminSignUp ar);
	
	AdminSignUp findByUserName(String username);

}
