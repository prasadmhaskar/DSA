package com.practice.recursion;

//Amazon

public class TilingProblem {
    public static void main(String[] args) {
        System.out.println(caculateWays(5));
    }

    private static int caculateWays(int n) {

        if (n == 0 || n == 1){
            return 1;
        }

        //vertical choice
        int fnm1 = caculateWays(n-1);

        //horizontal choice
        int fnm2 = caculateWays(n-2);

        return fnm1 + fnm2;
    }
}
