package com.dmdev.cs.lesson8;

public class Lesson8Runner {

    public static void main(String[] args) {
        double doubleValue = 12.98; // define + init
        System.out.println(doubleValue);

        int intValue; // определение (define)
        intValue = 28; // инициализация initialization
        System.out.println(intValue); // int

        intValue = 67;
        System.out.println(intValue);

        int intValue2 = 1908;
        intValue = intValue2;
        System.out.println(intValue);

        final byte byteValue = 39; //неявное преобразование в литерал инта
        System.out.println(byteValue);

//        byteValue = -89;

        char charValue = 'q';
        System.out.println(charValue);

        boolean booleanValue = true;
        System.out.println(booleanValue);

        String stringValue = "Hello World";
        System.out.println(stringValue);
    }
}
