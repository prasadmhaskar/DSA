package com.practice;

public class Test {
    public static void main(String[] args) {
        int[] arr = {6,4,7,336,74,367,337,45,3,536,5};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        Arrays.stream(arr).forEach(System.out::println);

        for (int i=0; i< arr.length; i++){
            if (arr[i] == 366){
                System.out.println("Element found at index: "+i);
                return;
            }
        }
        System.out.println("Element not found");

    }
}
