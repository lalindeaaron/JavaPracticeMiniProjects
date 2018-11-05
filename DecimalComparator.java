package com.company;

import java.text.DecimalFormat;

public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756,-3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175,3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0,3.0));

    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        firstNumber*= 1000 ;
        secondNumber *= 1000 ;
        int x =(int)firstNumber;
        int y =(int)secondNumber;
        if (x == y) {
            return true;
        } else
            return false;

    }
}
