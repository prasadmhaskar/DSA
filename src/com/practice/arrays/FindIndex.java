package com.practice.arrays;

import java.util.Scanner;

public class FindIndex {
    public static void main(String[] args) {

//Find the index of a given element in an array (linear search).

        int[] array = {5, 3, 6, 8, 1, 4, 9};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its index: ");
        int number = sc.nextInt();

        int index = -1; // default -1 to indicate "not found"

        // Loop through the array to find the number
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                index = i; // store index when found
                break;     // stop searching after first match
            }
        }

        // Print result
        if (index != -1) {
            System.out.println("Index of " + number + " is: " + index);
        } else {
            System.out.println(number + " not found in array.");
        }

        sc.close();

    }
}
