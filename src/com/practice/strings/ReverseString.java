package com.practice.strings;

import java.util.*;

public class ReverseString {
    public static void main(String[] args) {

//My code---------------------------------------------->

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Please enter String that to be reversed: ");
//        String Original = sc.next();
//
//        String[] split = Original.split("");
//        System.out.println(Arrays.toString(split));
//
//        List<String> list = new ArrayList<>();
//        for(int i= split.length-1; i>= 0 ;i--){
//            list.add(split[i]);
//        }
//        System.out.println(list);
//
//        String join = String.join("",list);
//        System.out.println("Reversed String: "+join);

//ChatGPT code----------------------------------------->
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Please enter String to be reversed: ");
//        String original = sc.next();
//
//        // Convert to char array and reverse using loop
//        String reversed = "";
//        for (int i = original.length() - 1; i >= 0; i--) {
//            reversed += original.charAt(i);
//        }
//
//        System.out.println("Reversed String: " + reversed);
//        sc.close();

//OneLine code (StringBuilder)----------------------------------->
//Interview Recommendation
//Always prefer StringBuilder approach because:
//Clean one-liner code
//Best time efficiency (O(n))
//Minimum memory usage (O(n))
//Shows interviewer you understand immutability of String

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter String to be reversed: ");
        String original = sc.next();

        String reversed = new StringBuilder(original).reverse().toString();
        System.out.println("Reversed String: " + reversed);
    }
}
