package com.company;

public class Main {

//    Given 2 int values, return true if either of them is in the range 10..20 inclusive.
//            in1020(12, 99) → true
//            in1020(21, 12) → true
//            in1020(8, 99) → false

    public boolean in1020(int a, int b) {
        if (a < 21 && a > 9 || b < 21 && b > 9){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
	// write your code here
    }
}
