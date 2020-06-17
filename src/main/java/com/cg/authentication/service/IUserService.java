package com.cg.authentication.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.cg.authentication.model.User;
import com.cg.authentication.web.dto.UserRegistrationDto;

public interface IUserService extends UserDetailsService{
	public User save(UserRegistrationDto registrationDto);
}
