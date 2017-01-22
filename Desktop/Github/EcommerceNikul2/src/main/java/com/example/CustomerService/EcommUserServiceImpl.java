package com.example.CustomerService;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.CustomerModel.UserSignup;
import com.example.Customerinterface.CstmrInterface;


@Service
public class EcommUserServiceImpl implements UserDetailsService {

	@Autowired
	@Lazy
    private CstmrInterface cstrRepository;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserSignup user = cstrRepository.findByUserName(username);
        System.out.println(user.getRoles());
        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        grantedAuthorities.add(new SimpleGrantedAuthority(user.getRoles()));
        System.out.println(user.getRoles());
        System.out.println(grantedAuthorities.toString());
        String pass = String.valueOf(user.getPassword());
        
        return new org.springframework.security.core.userdetails.User(user.getUsername(), pass, grantedAuthorities);
    }
	
}
