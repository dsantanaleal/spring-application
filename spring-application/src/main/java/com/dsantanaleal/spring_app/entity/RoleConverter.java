package com.dsantanaleal.spring_app.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.dsantanaleal.spring_app.repository.RoleRepository;

@Component
public class RoleConverter implements Converter<String, Role> {
	
	@Autowired
	RoleRepository roleRepository;
	
    @Override
    public Role convert(String id) {
        return roleRepository.findById(Long.valueOf(id)).orElse(null);
    }
}