///**
// * 
// */
//package com.example.CustomerModel;
//
//import java.util.Set;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.ManyToMany;
//import javax.persistence.Table;
//
//import org.springframework.stereotype.Component;
//
///**
// * @author Nikul
// *
// */
//@Component
//@Entity
//@Table(name="Roles")
//public class UserRoles {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Column(name="Role_id")
//	private Long Roleid;
//	@Column(name="Role_name")
//    private String RoleName;
//    private Set<UserSignup> users;
//	public Long getRoleid() {
//		return Roleid;
//	}
//	public void setRoleid(Long roleid) {
//		Roleid = roleid;
//	}
//	public String getRoleName() {
//		return RoleName;
//	}
//	public void setRoleName(String roleName) {
//		RoleName = roleName;
//	}
//	@ManyToMany(cascade=CascadeType.ALL, mappedBy = "roles")
//	public Set<UserSignup> getUsers() {
//		return users;
//	}
//	public void setUsers(Set<UserSignup> users) {
//		this.users = users;
//	}
//	public UserRoles(String roleName, Set<UserSignup> users) {
//		super();
//		RoleName = roleName;
//		this.users = users;
//	}
//    public UserRoles(){
//    	
//    }
//    
//   
//}
