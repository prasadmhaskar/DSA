package com.practice.arrays;

public class MaxSubArray1 {
    public static void main(String[] args) {

//BruteForce method - O(n^3)
//        int [] array = {2,4,6,8,10};
        int [] array = {-2, -3, 4, -1, -2, 1, 5, -3};
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i=0 ; i< array.length ; i++){
            for (int j=i ; j< array.length;j++){
                currSum = 0;
                for (int k=i; k <= j; k++){
                    currSum += array[k];
                }
                System.out.println(currSum);
                if (currSum > maxSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum subarray sum: "+maxSum);
    }
}
