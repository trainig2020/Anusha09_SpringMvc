package com.anusha.controller;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;

@Documented
@Constraint(validatedBy = HobbyValidator.class)
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface IsValidHobby {
	
	  String listOfValidHobbies() default "Music|Football|Cricket|Hockey";
	
	String message() default "please provide a valid Hobby;"
			+ "accepted hobbies are - Music, Football, Cricket and Hockey (choose anyone)";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}
