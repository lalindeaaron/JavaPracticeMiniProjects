package com.company;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }

    public static int getGreatestCommonDivisor(int x, int y) {
        if (x < 10 || y < 10) {
            return -1;
        }
        for (int i = x; i >= 1; i--) {
            if (x % i == 0) {
                for (int j = y; j >= 1; j--) {
                    if (y % j == 0 && i == j) {
                        return j;
                    }
                }
            }

        }
        return -1;


    }
}
