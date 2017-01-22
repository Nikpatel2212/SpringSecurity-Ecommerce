/**
 * 
 */
package com.example.CustomerService;

/**
 * @author Nikul
 *
 */
public interface EcommAppSecurity {

	String findLoggedInUsername();

    void autologin(String username, String password);
}
