package com.company;

// Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
//
//        makes10(9, 10) → true
//        makes10(9, 9) → false
//        makes10(1, 9) → true

public class Main {

    public boolean makes10(int a, int b) {
        int sum = a + b;
        if (sum == 10 || a == 10 || b == 10){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
	// write your code here
    }
}
