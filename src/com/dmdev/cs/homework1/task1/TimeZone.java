package com.dmdev.cs.homework1.task1;

public class TimeZone {

    public static void getTimeZones(int minutes) {
        if (0 <= minutes && minutes <= 14) {
            System.out.println("Первая четверть");
        } else if (15 <= minutes && minutes <= 30) {
            System.out.println("Вторая четверть");
        } else if (30 <= minutes && minutes <= 45) {
            System.out.println("Третья четверть");
        } else if (45 <= minutes && minutes <= 60) {
            System.out.println("Четвертая четверть");
        } else if (minutes > 60) {
            System.out.println("Некорректное значения: " + minutes);
        }
    }
}
