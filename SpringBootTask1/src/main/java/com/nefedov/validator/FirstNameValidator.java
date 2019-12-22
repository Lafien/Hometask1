package com.nefedov.validator;

import com.nefedov.annotation.FirstNameConstraint;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class FirstNameValidator implements
        ConstraintValidator<FirstNameConstraint, String> {

    @Override
    public void initialize(FirstNameConstraint constraintAnnotation) {
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return !s.isEmpty();
    }
}
