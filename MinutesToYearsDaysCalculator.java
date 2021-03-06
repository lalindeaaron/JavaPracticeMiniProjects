package com.company;

public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        }
        else {
            long year = minutes / 525600;
            long day = minutes % 525600;
            long remainingMinutes = day /1440;

            System.out.println(minutes + " min = " + year + " y and " + remainingMinutes + " d");
        }
    }
}
