package com.company;


//Given two int values, return their sum. Unless the two values are the same, then return double their sum.
//
//
//        sumDouble(1, 2) → 3
//        sumDouble(3, 2) → 5
//        sumDouble(2, 2) → 8

public class Main {

    static int sumDouble(int a, int b) {
        if (a == b){
            return (a + b) * 2;
        }

        return a + b;
    }

    public static void main(String[] args) {
	// write your code here

    }
}
