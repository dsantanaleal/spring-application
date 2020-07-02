package com.dsantanaleal.spring_app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsantanaleal.spring_app.entity.User;
import com.dsantanaleal.spring_app.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository repository;

	@Override
	public Iterable<User> getAllUsers() {
		return repository.findAll();
	}
	
	@Override
	public User createUser(User user) throws Exception {
		if(checkUsernameAvailable(user) && checkPasswordMatch(user)) {
			user = repository.save(user);
		}
		return user;
	}
	
	public boolean checkUsernameAvailable(User user) throws Exception {
		Optional<User> userFound = repository.findByUsername(user.getUsername());
		if(userFound.isPresent()) {
			throw new Exception("Username already exists!");
		}
		return true;
	}
	
	public boolean checkPasswordMatch(User user) throws Exception {
		if(!user.getPassword().equals(user.getConfirmarPassword())) {
			throw new Exception("Password and confirm password are not equal");
		}
		return true;
	}
	
}
