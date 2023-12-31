package com.dmdev.cs.homework1.task2;

public class Function {

    public static void getResults(double first, double second, char symbol) {
        switch (symbol) {
            case '+' -> System.out.println(first + second);
            case '-' -> System.out.println(first - second);
            case '*' -> System.out.println(first * second);
            case '/' -> {
                if (second == 0.0) {
                    System.out.println("На ноль делить нельзя");
                } else {
                    System.out.println(first / second);
                }
            }
            case '%' -> System.out.println(first % second);
            default -> System.out.println("Некорректная операция, " +
                    "возможны лишь варианты операций: " + '+' + ", " + '-' + ", " + '*' + ", " + '/' + " или " + '%');
        }
    }
}
