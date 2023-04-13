package com.bezkoder.spring.jpa.h2;

public class Training {
    public static void main(String args[]) {
        System.out.println(sum(158, 986));
        System.out.println(divide(250,25));
    }

    public static Integer sum(int number1, int number2) {
        return number1 + number2;
    }

    public static Integer divide(int number1, int number2) {
        return number1 / number2;
    }
}

