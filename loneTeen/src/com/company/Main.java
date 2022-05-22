package com.company;

//We'll say that a number is "teen" if it is in the range 13..19 inclusive.
// Given 2 int values, return true if one or the other is teen, but not both.
//
//
//        loneTeen(13, 99) → true
//        loneTeen(21, 19) → true
//        loneTeen(13, 13) → false

public class Main {
    public boolean loneTeen(int a, int b) {
        return (((a>12 && a <20) && (b<=12 || b >= 20)) || ((b>12 && b <20) && (a<=12 || a >= 20)) );
    }

    public static void main(String[] args) {
	// write your code here
    }
}
