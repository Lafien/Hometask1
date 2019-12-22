package com.nefedov.validator;

import com.nefedov.annotation.LastNameConstraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastNameValidator implements
        ConstraintValidator<LastNameConstraint, String> {

    @Override
    public void initialize(LastNameConstraint constraintAnnotation) {
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return !s.isEmpty();
    }
}
