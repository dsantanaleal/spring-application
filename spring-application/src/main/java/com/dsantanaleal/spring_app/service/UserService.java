package com.dsantanaleal.spring_app.service;

import com.dsantanaleal.spring_app.entity.User;

public interface UserService {
	
	public Iterable<User> getAllUsers();
	public User createUser(User user) throws Exception;
	public User getUserById(Long id) throws Exception;
	public User updateUser(User user) throws Exception;
	public void deleteUser(Long id) throws Exception;
	
}
