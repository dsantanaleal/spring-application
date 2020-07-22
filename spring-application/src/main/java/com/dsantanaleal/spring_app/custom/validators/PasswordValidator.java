package com.dsantanaleal.spring_app.custom.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.dsantanaleal.spring_app.custom.constraints.PasswordConstraint;

public class PasswordValidator implements ConstraintValidator<PasswordConstraint, String> {
	
	@Override
	public void initialize(PasswordConstraint constraintAnnotation) {
	}

	@Override
	public boolean isValid(String password, ConstraintValidatorContext context) {
		return password != null && !password.isEmpty();
	}

}
