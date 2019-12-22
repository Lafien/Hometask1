package com.nefedov.validator;

import com.nefedov.annotation.AgeConstraint;
import com.nefedov.annotation.SalaryConstraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class SalaryValidator implements
        ConstraintValidator<SalaryConstraint, Integer> {

    @Override
    public void initialize(SalaryConstraint constraintAnnotation) {

    }

    @Override
    public boolean isValid(Integer s, ConstraintValidatorContext constraintValidatorContext) {
        return s != null && s>0;
    }
}
