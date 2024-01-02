package com.ltp.fieldvalidation;

import java.util.Arrays;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ScoreValidator implements ConstraintValidator<Score, String> {

    List<String> scores = Arrays.asList("A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "F");
    String[] scores2 = {};
    
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        for (String score: scores) {
            if (value.equals(score)) return true;
        }
        return false;
    }
}
