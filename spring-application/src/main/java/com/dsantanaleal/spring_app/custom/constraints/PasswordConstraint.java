package com.dsantanaleal.spring_app.custom.constraints;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Payload;

import javax.validation.Constraint;

import com.dsantanaleal.spring_app.custom.validators.PasswordValidator;

@Documented
@Constraint(validatedBy = PasswordValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface PasswordConstraint {
	String message() default "Password contains errors";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
}
