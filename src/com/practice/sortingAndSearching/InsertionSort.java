package com.practice.sortingAndSearching;

public class InsertionSort {
    public static void main(String[] args) {

        int[] array = {5,2,6,9,8,1,3,7,4};

        System.out.println("<-Original array->");
        for (int i: array){
            System.out.print(i+" ");
        }

        insertionSort(array);
    }

    private static void insertionSort(int[] array) {

        for (int i = 1; i < array.length; i++){
            int temp = array[i];
            int j = i - 1;

            while(j >= 0 && array[j] > temp){
                array[j + 1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }

        System.out.println("\n<-Sorted array->");
        for (int i: array){
            System.out.print(i+" ");
        }
    }
}
