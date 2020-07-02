package com.dsantanaleal.spring_app.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dsantanaleal.spring_app.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	
	public Optional<User> findByUsername(String username);
	
}
