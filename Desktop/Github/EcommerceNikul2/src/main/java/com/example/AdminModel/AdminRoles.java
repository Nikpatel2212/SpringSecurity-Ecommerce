package com.example.AdminModel;


import java.util.Set;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "Admin_role")
public class AdminRoles {

	@Id
    @GeneratedValue
	@Column(name="Admin_roleId")
	private Long AdRoleid;
	@Column(name="Role_name")
    private String RoleName;
	//@ElementCollection(targetClass=AdminSignUp.class)
	@ManyToMany(mappedBy = "roles")
    private Set<AdminSignUp> users;
	public Long getAdRoleid() {
		return AdRoleid;
	}
	public void setAdRoleid(Long adRoleid) {
		AdRoleid = adRoleid;
	}
	public String getRoleName() {
		return RoleName;
	}
	public void setRoleName(String roleName) {
		RoleName = roleName;
	}
	
	public Set<AdminSignUp> getUsers() {
		return users;
	}
	public void setUsers(Set<AdminSignUp> users) {
		this.users = users;
	}
	
    public AdminRoles(){
    	
    }
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((AdRoleid == null) ? 0 : AdRoleid.hashCode());
		result = prime * result + ((RoleName == null) ? 0 : RoleName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AdminRoles other = (AdminRoles) obj;
		if (AdRoleid == null) {
			if (other.AdRoleid != null)
				return false;
		} else if (!AdRoleid.equals(other.AdRoleid))
			return false;
		if (RoleName == null) {
			if (other.RoleName != null)
				return false;
		} else if (!RoleName.equals(other.RoleName))
			return false;
		return true;
	}
	public AdminRoles(String roleName) {
		super();
		RoleName = roleName;
	}
	
    

}
