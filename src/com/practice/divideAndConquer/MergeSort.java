package com.practice.divideAndConquer;

public class MergeSort {
    // Method to merge two halves of the array
    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;  // Size of left half
        int n2 = right - mid;     // Size of right half

        // Create temporary arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        // Merge the temp arrays back into arr[left...right]
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[], if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[], if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Recursive method to sort the array
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            // Find the middle point
            int mid = (left + right) / 2;

            // Sort first and second halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};

        System.out.println("Before Sorting:");
        for (int num : arr)
            System.out.print(num + " ");

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("\n\nAfter Sorting:");
        for (int num : arr)
            System.out.print(num + " ");
    }
}
