package com.nefedov.validator;

import com.nefedov.annotation.LastNameConstraint;
import com.nefedov.annotation.SecondNameConstraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class SecondNameValidator implements
        ConstraintValidator<SecondNameConstraint, String> {

    @Override
    public void initialize(SecondNameConstraint constraintAnnotation) {
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return !s.isEmpty();
    }
}
