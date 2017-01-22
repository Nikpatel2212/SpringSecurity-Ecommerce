package com.example.CustomerDao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.example.CustomerModel.UserSignup;
import com.example.Customerinterface.CstmrInterface;

@Repository
public class CstmrDao implements CstmrInterface {
	

	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

	
	@Transactional
	public void CustomerSignup(UserSignup sr)
	{
		String pass1 = String.valueOf(sr.getPassword());
		String a = bCryptPasswordEncoder.encode(pass1);
		char[] abc= a.toCharArray();
		sr.setPassword(abc);
		
		sessionFactory.getCurrentSession().save(sr);
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public UserSignup findByUserName(String username) {
		// TODO Auto-generated method stub
		List<UserSignup> users = new ArrayList<UserSignup>();

		users = sessionFactory.getCurrentSession()
			.createQuery("from UserSignup where username=:username")
			.setParameter("username", username)
			.list();

		if (users.size() > 0) {
			return users.get(0);
		} else {
			return null;
		}
	}

}
