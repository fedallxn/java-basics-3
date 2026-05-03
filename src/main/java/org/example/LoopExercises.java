package org.example;

public class LoopExercises {
    public int sum(int n) {
        int total = 0;
        for (int i = 0; i <= n; i++) {
            total += i;
        }
        return total;
    }

    public int sumUntilEven(int n) {
        int sum = 0;
        int counter = 1;
        //needed to check if the sum is even and also if it's equal to 0
        while (counter <= n && (sum % 2 != 0 || sum == 0)) {
            sum += counter;
            counter ++;
            }
        return sum;
    }
}
