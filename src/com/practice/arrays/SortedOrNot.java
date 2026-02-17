package com.practice.arrays;

public class SortedOrNot {
    public static void main(String[] args) {

//Check if an array is sorted in ascending order.

        int[] array = {1,2,3,4,5,6,7,8,9,10,11};

        boolean ordered = true;  // assume sorted unless proven otherwise

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                ordered = false;
                break;  // no need to check further
            }
        }

        if (ordered) {
            System.out.println("Ordered in ascending");
        } else {
            System.out.println("Not ordered in ascending");
        }
    }
}
