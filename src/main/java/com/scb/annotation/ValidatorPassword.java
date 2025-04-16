package com.scb.annotation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidatorPassword  implements ConstraintValidator<Password, String> {

    /**
     * @param password
     * @param constraintValidatorContext
     * @return
     */
    @Override
    public boolean isValid(String password, ConstraintValidatorContext constraintValidatorContext) {
        // Regex for 8-20 characters with at least one lowercase, uppercase, digit, and special character
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*])[A-Za-z\\d!@#$%^&*]{8,20}$";
        if (password == null || password.isEmpty()) {
            return false;
        }
        return password.matches(regex);
    }
}
