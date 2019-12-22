package com.nefedov.validator;

import com.nefedov.annotation.AgeConstraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgeValidator implements
        ConstraintValidator<AgeConstraint, Integer> {

    @Override
    public void initialize(AgeConstraint constraintAnnotation) {

    }

    @Override
    public boolean isValid(Integer s, ConstraintValidatorContext constraintValidatorContext) {
        return s != null && s>0;
    }
}
