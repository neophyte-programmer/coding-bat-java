package com.company;


// Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
//
//
//        mixStart("mix snacks") → true
//        mixStart("pix snacks") → true
//        mixStart("piz snacks") → false

public class Main {
    static boolean mixStart(String str) {
        if (str.length() >= 3) {
            String twoChar = str.substring(1,3);
            if (twoChar.equals("ix")){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
	// write your code here
        boolean input = mixStart("miz pizzas");
        if (input){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
