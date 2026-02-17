package com.practice.sortingAndSearching;

public class LinearSearch {
    public static void main(String[] args) {

        int[] array = {5, 3, 6, 8, 2, 4, 1, 9, 7};

        int index = linearSearch(array, 4);

        if (index != -1){
            System.out.println("Element is at index: "+index);
        }
        else System.out.println("Element not found");
    }

    private static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}