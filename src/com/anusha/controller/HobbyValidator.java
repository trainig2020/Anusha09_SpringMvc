package com.anusha.controller;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class HobbyValidator implements ConstraintValidator<IsValidHobby, String> {
	
	private String listOfValidHobbies;
	@Override
	public void initialize(IsValidHobby isValidHobby) {
		
		//this.listOfValidHobbies = IsValidHobby.listOfValidHobbies();

	}

	@Override
	public boolean isValid(String studentHobby, ConstraintValidatorContext ctx) {

		if (studentHobby == null) {
			return false;

		}
		if (studentHobby.matches(listOfValidHobbies)) {
			return true;
		} else {
			return false;
		}

	}

}
