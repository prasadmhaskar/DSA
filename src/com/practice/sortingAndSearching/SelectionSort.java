package com.practice.sortingAndSearching;

public class SelectionSort {
    public static void main(String[] args) {

        int[] array = {5,2,6,9,8,1,3,7,4};

        System.out.println("<-Original array->");
        for (int i: array){
            System.out.print(i+" ");
        }

        selectionSort(array);
    }

    private static void selectionSort(int[] array) {

        for (int i = 0; i < array.length; i++){
            int min = i;
            for (int j = i+1; j < array.length; j++){
                if (array[min] > array[j]){
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
        System.out.println("\n<-Sorted array->");
        for (int i: array){
            System.out.print(i+" ");
        }
    }
}
