package com.nefedov.annotation;

import com.nefedov.validator.LastNameValidator;
import com.nefedov.validator.SecondNameValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = SecondNameValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface SecondNameConstraint {
    String message() default "Invalid second name";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
