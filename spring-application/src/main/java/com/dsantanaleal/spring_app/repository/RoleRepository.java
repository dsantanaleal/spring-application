package com.dsantanaleal.spring_app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dsantanaleal.spring_app.entity.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {

}
