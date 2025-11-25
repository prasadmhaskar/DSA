package com.practice.arrays;

public class MaxAndMin {
    public static void main(String[] args) {

//Find the maximum and minimum element in an array.

        int[] array = {34, 65, 226, 866, 2, 6, 335, 654, 6, 3, 1465, 33};

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Max number is: " + max);
        System.out.println("Min number is: " + min);

    }
}
