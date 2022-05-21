package com.company;

//Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
// Use the % "mod" operator 
//
//
//        or35(3) → true
//        or35(10) → true
//        or35(8) → false


public class Main {

    static boolean or35(int n) {
        int modThree = n%3;
        int modFive = n%5;
        if (modThree == 0 || modFive == 0){
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
	// write your code here
    }
}
