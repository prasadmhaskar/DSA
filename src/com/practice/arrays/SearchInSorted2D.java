package com.practice.arrays;

public class SearchInSorted2D {
    public static void main(String[] args) {

        //matrix is sorted row wise and column wise
        int[][] matrix = {{10, 20, 30, 40},
                          {15, 25, 35, 45},
                          {27, 29, 37, 48},
                          {32, 33, 39, 50}};

        int target = 33;
        staircaseSearch(matrix, target);
    }

    private static void staircaseSearch(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length-1;

        while (row < matrix.length && col >= 0){
            if (matrix[row][col] == target){
                System.out.println("Target found at cell (" +row+ "," +col+")");
                return;
            } else if (matrix[row][col] > target) {
                col--;
            } else if (matrix[row][col] < target) {
                row++;
            }
        }
        System.out.println("Element not found");
    }
}
