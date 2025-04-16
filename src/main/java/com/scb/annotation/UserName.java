package com.scb.annotation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ValidatorUserName.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface UserName {
    String message() default "Invalid User Name";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
