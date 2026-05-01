package org.example;

public class ConditionalExercises {
    public boolean lessThanFive(int x) {
        if (x < 5) {
            return true;
        } else {
            return false;
        }
    }

    public String getAgeGroup(int age) {
        if (age < 13) {
            return "child";
        } else if (age >= 20) {
            return "adult";
        } else {
            return "teen";
        }
    }

    public boolean isValidPassword(String password) {
        int passwordLength = password.length();
        if (passwordLength >= 8) {
            return true;
        } else {
            return false;
        }
    }
}
