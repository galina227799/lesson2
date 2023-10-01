package ru.geekbrains.lesson2;

import java.sql.Array;

public class HWTask2 {
    public static void main(String[] args) {
        try {
            int d = 0;
            int[] intArray = {1, 14, 6, 6, 7, 3, 2, 1, 28};
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}