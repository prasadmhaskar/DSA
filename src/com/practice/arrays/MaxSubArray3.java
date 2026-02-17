package com.practice.arrays;

public class MaxSubArray3 {
    public static void main(String[] args) {

//-------->Kadane's algo method - O(n)  -for +ve and -ve elements
        int [] array = {-2, -3, 4, -1, -2, 1, 5, -3};

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i=0 ; i< array.length ; i++){

            currSum = currSum + array[i];
            if (currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }

            System.out.println("Maximum subarray sum: "+maxSum);



//-------->Kadane's algo method - O(n)  -for all -ve elements

        //        int [] array = {-2, -3, -1, -2, -3};

//        int currSum = 0;
//        int maxSum = Integer.MIN_VALUE;
//        int max = Integer.MIN_VALUE;
//
//        for (int i=0 ; i< array.length ; i++){
//
//            if (array[i] > max){
//                max = array[i];
//            }
//            currSum = currSum + array[i];
//            if (currSum < 0){
//                currSum = 0;
//            }
//            maxSum = Math.max(currSum, maxSum);
//        }
//        if (maxSum != 0){
//            System.out.println("Maximum subarray sum: "+maxSum);
//        }
//        else System.out.println("Maximum subarray of all negative elements is: "+max);
    }
}
