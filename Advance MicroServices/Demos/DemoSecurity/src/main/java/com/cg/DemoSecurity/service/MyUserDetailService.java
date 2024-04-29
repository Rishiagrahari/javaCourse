package com.cg.DemoSecurity.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.cg.DemoSecurity.config.UserPrinciple;
import com.cg.DemoSecurity.dao.UserRepository;
import com.cg.DemoSecurity.dto.User;
@Service
public class MyUserDetailService implements UserDetailsService{
   @Autowired
	UserRepository userrepositoty;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user=userrepositoty.findByUsername(username);
		if(user==null) {
			throw new UsernameNotFoundException("UserName Password not found");
		}
		
		return new UserPrinciple(user);
	}

}
