package com.company;

public class Main {
    static String backAround(String str) {
        char lastLetter = str.charAt(str.length() - 1);
        String newString = lastLetter + str + lastLetter;
        return newString;
    }
    public static void main(String[] args) {
	// Test input
        String input = backAround("Champion");
        System.out.println(input);
    }
}
