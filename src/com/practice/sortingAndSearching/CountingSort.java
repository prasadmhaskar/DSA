package com.practice.sortingAndSearching;

public class CountingSort {

    //-This sorting is used where the range of elements is small and the number of elements is large.
    //-Best for : Sorting integers in a small range, like marks (0–100), ages, or similar data.

    public static void main(String[] args) {
        int[] array = {3,1,5,1,4,8,7,8};
        countingSort(array);
        for (int i = 0; i < array.length; i++){
        System.out.print(array[i]);
    }
    }

    private static void countingSort(int[] array) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++){
           largest = Math.max(largest, array[i]);
        }

        int[] count = new int[largest + 1];
        for(int i = 0; i < array.length; i++){
            count[array[i]]++;
        }

        int j = 0;
        for (int i=0 ; i< count.length; i++){
            while (count[i] > 0){
                array[j] = i;
                j++;
                count[i]--;
            }
        }
    }
}

