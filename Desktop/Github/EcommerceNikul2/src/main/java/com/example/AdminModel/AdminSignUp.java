package com.example.AdminModel;




import java.util.Set;

import javax.persistence.JoinColumn;

import javax.persistence.CascadeType;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "Admin_user")
public class AdminSignUp {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Admin_id")
	private Long id;
	@Column(name="Admin_username" , unique = true,
			nullable = false, length = 45)
    private String username;
	@Column(name="Admin_password", nullable = false, length = 60)
    private char[] password;
	@Column(name="Admin_name")
	private String Aname;
	@Column(name="Admin_email", nullable = false, length = 60)
	private String email;
	@Column(name="Ad_EnableDisable")
	private boolean enabled;
	//@ElementCollection(targetClass=AdminRoles.class)
	@ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    @JoinTable(name = "Admin_user_Admin_role", joinColumns ={ @JoinColumn(name = "Admin_id")}, inverseJoinColumns = {@JoinColumn(name = "Admin_roleId")})
    private Set<AdminRoles> roles;
	@Transient
	private String cpassword;
	
	
	public String getCpassword() {
		return cpassword;
	}

	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getAname() {
		return Aname;
	}

	public void setAname(String aname) {
		Aname = aname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	
	public Set<AdminRoles> getRoles() {
		return roles;
	}

	public void setRoles(Set<AdminRoles> roles) {
		this.roles = roles;
	}
	public AdminSignUp(){
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
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
		AdminSignUp other = (AdminSignUp) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	public AdminSignUp(String username, char[] password, String aname, String email, boolean enabled) {
		super();
		this.username = username;
		this.password = password;
		Aname = aname;
		this.email = email;
		this.enabled = enabled;
	}
	
    

}
