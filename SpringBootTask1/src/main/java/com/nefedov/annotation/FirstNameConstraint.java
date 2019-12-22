package com.nefedov.annotation;

import com.nefedov.validator.FirstNameValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = FirstNameValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface FirstNameConstraint {
    String message() default "Invalid first name";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
