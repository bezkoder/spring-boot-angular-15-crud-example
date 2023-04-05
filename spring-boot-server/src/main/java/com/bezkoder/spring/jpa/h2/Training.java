package com.bezkoder.spring.jpa.h2;

public class Training {
    public static void main(String args[]) {
        int totalSum = sum(158, 986);
        System.out.println(totalSum);
    }

    public static Integer sum(int number1, int number2) {
        int totalSum = number1 + number2;
        return totalSum;
    }
}
