package com.dmdev.cs.homework2.arrays.task1;

/**
 * Дан одномерный массив целых чисел.
 * Написать функцию, удаляющую из него все отрицательные элементы (удалить - значит создать новый массив с только положительными элементами).
 * После удаления - умножить каждый элемент массива на его длину.
 * Например: [3, 5, -6, 3, 2, -9, 0, -123] -> [15, 25, 15, 10, 0]
 * <p>
 * Не забывать, что всю логику приложения нужно выносить в отдельные функции. main - только для тестирования написанного функционала.
 */

public class Main {
    public static int[] arr = {3, 5, -6, 3, 2, -9, 0, -123};

    public static void main(String[] args) {
        int count = ArrayCounter.getCount(arr);
        PositiveNumbersArray.getPositiveArray(count, arr);
    }
}