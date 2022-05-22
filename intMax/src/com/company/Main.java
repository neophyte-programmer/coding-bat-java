package com.company;


//Given three int values, a b c, return the largest.
//
//
//        intMax(1, 2, 3) → 3
//        intMax(1, 3, 2) → 3
//        intMax(3, 2, 1) → 3

public class Main {

    static int intMax(int a, int b, int c) {
        int max = 0;
        if ( a > b){
            max = a;
        }
        else {
            max = b;
        }

        if (max < c){
            max = c;
        }

        return max;
    }

    public static void main(String[] args) {
	// write your code here
        int input = intMax(11, 15, 10);
        System.out.println(input);
    }
}
