package com.practice.arrays;

public class SecondLargest {
    public static void main(String[] args) {

//Find the second largest element in an array.

        int[] array = {5, 1, 7, 9, 2, 3, 8};

        int max = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                // update both when we find a new max
                secondLargest = max;
                max = array[i];
            } else if (array[i] > secondLargest && array[i] != max) {
                // update only second largest if it’s smaller than current number
                secondLargest = array[i];
            }
        }

        System.out.println("Largest number: " + max);
        System.out.println("Second largest number: " + secondLargest);
    }
}
