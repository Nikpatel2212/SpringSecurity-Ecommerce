package com.example.CustomerModel;





import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="Customer")
public class UserSignup {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name="Customer_name")
	private String name;
	@Column(name="Customer_email", nullable = false, length = 60)
	private String email;
	@Column(name="Customer_username", unique = true,
			nullable = false, length = 45)
	private String username;
	@Column(name="Customer_password", nullable = false, length = 60)
	private char[] password;
	@Column(name="Enable_disable")
	private boolean enabled;
	@Column(name="Roles", insertable=false)
	private String roles;
//	private Set<UserRoles> userRole;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public char[] getPassword() {
		return password;
	}
	public void setPassword(char[] password) {
		this.password = password;
	}
	
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
//	@ManyToMany(cascade=CascadeType.ALL) 
//    //@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "userId"), inverseJoinColumns = @JoinColumn(name = "roleId"))
//	public Set<UserRoles> getUserRole() {
//		return userRole;
//	}
//	public void setUserRole(Set<UserRoles> userRole) {
//		this.userRole = userRole;
//	}
//	
	
	
	public UserSignup(String name, String email, String username, char[] password, boolean enabled, String roles) {
	super();
	this.name = name;
	this.email = email;
	this.username = username;
	this.password = password;
	this.enabled = enabled;
	this.roles = roles;
}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	public UserSignup(){
		
	}
	
}
