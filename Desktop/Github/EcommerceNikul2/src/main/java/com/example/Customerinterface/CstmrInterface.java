package com.example.Customerinterface;



import com.example.CustomerModel.UserSignup;

public interface CstmrInterface {

	public void CustomerSignup(UserSignup ur);
	
	UserSignup findByUserName(String username);
	
}
