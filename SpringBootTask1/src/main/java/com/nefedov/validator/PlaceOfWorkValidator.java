package com.nefedov.validator;

import com.nefedov.annotation.LastNameConstraint;
import com.nefedov.annotation.PlaceOfWorkConstraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PlaceOfWorkValidator implements
        ConstraintValidator<PlaceOfWorkConstraint, String> {

    @Override
    public void initialize(PlaceOfWorkConstraint constraintAnnotation) {
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        System.out.println(!s.isEmpty());
        return !s.isEmpty();
    }
}
