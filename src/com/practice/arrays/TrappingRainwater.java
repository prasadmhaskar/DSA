package com.practice.arrays;

public class TrappingRainwater {

    public static void main(String[] args) {
        int[] height = {4,2,0,6,3,2,5};
        trappedRainwater(height);
    }

    private static void trappedRainwater(int[] height) {

        //calculate left max boundary
        int[] leftMax = new int[height.length];
        leftMax[0] = height[0];
        for (int i=1; i< height.length; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        //calculate right max boundary
        int[] rightMax = new int[height.length];
        rightMax[rightMax.length-1] = height[height.length-1];
        for (int i= height.length-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        //printing auxiliary arrays
        printArray(leftMax);
        printArray(rightMax);

        //Calculating trappedRainwater
        int trappedRainwater = 0;
        for (int i=0; i< height.length; i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedRainwater += waterLevel - height[i];
        }

        System.out.println("Total water that will be trapped is: "+trappedRainwater);
    }

    private static void printArray(int[] array){
        for (int i : array) {
            System.out.print(i + ",");
        }
        System.out.println();
    }
}
