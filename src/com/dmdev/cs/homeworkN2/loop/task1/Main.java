package com.dmdev.cs.homeworkN2.loop.task1;

import java.util.Scanner;


/**
 * Посчитать четные и нечетные цифры целого числа и вывести их на консоль.
 * Для решения написать 2 функции, которые будут принимать введенное целое число,
 * а возвращать количество четных цифр (вторая функция - нечетных).
 */

public class Main {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите число: ");
        int value = SCANNER.nextInt();
        int even = CountEven.getEven(value);
        int odd = CountOdd.getOdd(value);
        System.out.println("Четные: " + even + "\nНечетные: " + odd);
    }
}
