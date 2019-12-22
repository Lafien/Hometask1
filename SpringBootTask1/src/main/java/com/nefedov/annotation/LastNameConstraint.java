package com.nefedov.annotation;

import com.nefedov.validator.LastNameValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = LastNameValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface LastNameConstraint {
    String message() default "Invalid last name";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
