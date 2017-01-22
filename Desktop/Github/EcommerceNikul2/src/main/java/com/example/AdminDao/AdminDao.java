/**
 * 
 */
package com.example.AdminDao;




import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.AdminInterfaces.AdminInterface;

import com.example.AdminModel.AdminSignUp;

/**
 * @author Nikul
 *
 */

@Repository
public class AdminDao implements AdminInterface {
	

	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
//	@Autowired 
//	private AdminRoleRepo ado;
	

	@Transactional
	public void EmployeeRegistration(AdminSignUp ar) {
		String pass2 = String.valueOf(ar.getPassword());
		String a = bCryptPasswordEncoder.encode(pass2);
		char[] abc= a.toCharArray();
		ar.setPassword(abc);
//		ar.setRoles(new HashSet<>(ado.findAll()));
		sessionFactory.getCurrentSession().save(ar);
	}

	@Override
	public AdminSignUp findByUserName(String username) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
