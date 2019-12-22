package com.nefedov.annotation;


import com.nefedov.validator.PlaceOfWorkValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = PlaceOfWorkValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface PlaceOfWorkConstraint {
    String message() default "Invalid place of work";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
