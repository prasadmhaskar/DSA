package com.practice.arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {

//Remove duplicates from a sorted array.

        int[] array = {1, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9, 10, 11};

        // If array has 0 or 1 elements, it's already unique
        if (array.length <= 1) {
            System.out.println("Array has no duplicates.");
            return;
        }

        int j = 0; // points to the last unique element

        // Compare each element with the next one
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                array[j] = array[i];
                j++;
            }
        }

        // Add the last element (always unique in sorted array)
        array[j] = array[array.length - 1];
        j++;

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < j; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
