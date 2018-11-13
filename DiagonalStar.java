package com.company;

public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(3);

    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }


        for (int i = 1; i <= number; i++) {

            for (int j = 1; j <= number; j++) {

                String text = " ";

                if (i == 1 || i == number)
                    text = "*";
                if (j == 1 || j == number)
                    text = "*";
                if (i == j)
                    text = "*";
                if (j == (number - i +1))
                    text = "*";

                System.out.print(text);
            }
            System.out.println();
        }
    }
}
