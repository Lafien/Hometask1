package com.nefedov.annotation;

import com.nefedov.validator.SalaryValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = SalaryValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface SalaryConstraint {
    String message() default "Invalid salary (salary must be greater than 0)";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
