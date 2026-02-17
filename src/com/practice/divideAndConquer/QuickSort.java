package com.practice.divideAndConquer;

public class QuickSort {
    // Method to partition the array
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // choose last element as pivot
        int i = low - 1;        // index of smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {   // if current element <= pivot
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap pivot to correct position (i+1)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;  // return pivot index
    }

    // Main quicksort method
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);  // partition index
            quickSort(arr, low, pi - 1);  // sort left part
            quickSort(arr, pi + 1, high); // sort right part
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};
        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        for (int num : arr)
            System.out.print(num + " ");
    }
}
