package com.practice.arrays;

public class ReverseArray {
    public static void main(String[] args) {

//Reverse an array in-place.


//chatGPT code----------------------------->
// Time Complexity: O(n) — each element is processed once.
// Space Complexity: O(n) — because you used a new array array2.
//        int[] array1 = {3, 6, 1, 7, 5, 4};
//
//        System.out.print("Original array: ");
//        for (int i : array1) {
//            System.out.print(i + " ");
//        }
//
//        int[] array2 = new int[array1.length];
//
//        // Correct reverse logic
//        for (int i = 0; i < array1.length; i++) {
//            array2[i] = array1[array1.length - 1 - i];
//        }
//
//        System.out.print("\nReversed array: ");
//        for (int j : array2) {
//            System.out.print(j + " ");
//        }

//Best approach for interviews(reverse in-place)--------------------------------------->
//Time Complexity: O(n)
//Space Complexity: O(1) (best approach — used in interviews)

        int[] array = {3, 6, 1, 7, 5, 4};
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
        for (int i : array){
            System.out.print(i + " ");
        }

    }
}
