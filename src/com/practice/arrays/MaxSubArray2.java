package com.practice.arrays;

public class MaxSubArray2 {
    public static void main(String[] args) {

//-------->PrefixSum method - O(n^2)
//        int [] array = {2,4,6,8,10};
        int [] array = {-2, -3, 4, -1, -2, 1, 5, -3};
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        int [] prefix = new int[array.length];

        //calculate prefix array -> Sum of all previous elements till that index
        prefix[0] = array[0];
        for (int i=1; i< array.length; i++){
            prefix[i] = prefix[i - 1] + array[i];
        }

        //printing prefix sum array
        System.out.print("Prefix array: ");
        for (int i : prefix){
            System.out.print(i + ", ");
        }



        for (int i=0 ; i< array.length ; i++){
            for (int j=i ; j< array.length;j++){

                currSum = i ==0 ? prefix[j] : prefix[j] - prefix[i-1];  //This formula will calculate sum of subarray using prefix array
                if (currSum > maxSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("\nMaximum subarray sum: "+maxSum);
    }
}
