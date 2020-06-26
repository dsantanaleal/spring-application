package com.dsantanaleal.spring_app.repository;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dsantanaleal.spring_app.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	
	public Set<User> findByUsername(String username);
	
}
