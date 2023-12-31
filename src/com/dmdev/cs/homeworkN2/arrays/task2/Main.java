package com.dmdev.cs.homeworkN2.arrays.task2;

import java.util.Arrays;

/**
 * Дан одномерный массив символов.
 * Преобразовать его в одномерный массив чисел, где число - это код символа (любой символ - это число в памяти компьютера).
 * Например: [‘a’, ‘6’, ‘y’, ‘P’, ‘T’, ‘q’, ‘9’, ‘+’] -> [97, 54, 121, 80, 84, 113, 57]

 * Далее определить среднее арифметическое всех элементов целочисленного массива и вывести на консоль только те элементы, которые больше этого среднего арифметического.
 */
public class Main {

    public static void main(String[] args) {
        char[] chars = {'a', '6', 'y', 'P', 'T', 'q', '9', '+'};
        int[] ints = new int[chars.length - 1];
        int[] numericArray = NumericArray.getNumericArray(chars, ints);
        int averageSum = AverageSum.getAverageSum(ints);
        System.out.println(Arrays.toString(numericArray));
        Compare.compareNumbers(ints, averageSum);
    }
}
