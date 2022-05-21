package com.company;

//Given an int n, return the absolute difference between n and 21,
// except return double the absolute difference if n is over 21.
//
//        diff21(19) → 2
//        diff21(10) → 11
//        diff21(21) → 0

public class Main {
    static int diff21(int n) {
        int dif = 21 - n;
        int diff = n - 21;

        if (n <= 21){
            return dif;
        }
        else {
            return diff * 2;
        }
    }

    public static void main(String[] args) {
	// Test input
        int input = diff21(99);
        System.out.println(input);
    }
}
