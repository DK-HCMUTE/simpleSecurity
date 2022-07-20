package com.shop.footwear.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.shop.footwear.entity.Role;
import com.shop.footwear.entity.User;
import com.shop.footwear.repository.RoleRepository;
import com.shop.footwear.repository.UserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	RoleRepository roleRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> userOpt = userRepository.findByUsername(username);
		User user = userOpt.get();
		Role role = userRepository.findRoleByUser(user);
		
		user.setRole(role);
		
		return new MyUserDetails(user);
	}

}
