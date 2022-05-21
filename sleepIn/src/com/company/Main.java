package com.company;


//The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
// We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
//
//        sleepIn(false, false) → true
//        sleepIn(true, false) → false
//        sleepIn(false, true) → true

public class Main {
    static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
	// Test input
        boolean input = sleepIn(false, true);
        if (input) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
