package com.company;

//Given a string, take the first 2 chars and return the string with the 2 chars added
// at both the front and back, so "kitten" yields"kikittenki". If the string length is less than 2,
// use whatever chars are there.
//
//
//        front22("kitten") → "kikittenki"
//        front22("Ha") → "HaHaHa"
//        front22("abc") → "ababcab"

public class Main {
    public String front22(String str) {
        // First figure the number of chars to take
        int take = 2;
        if (take > str.length()) {
            take = str.length();
        }

        String front = str.substring(0, take);
        return front + str + front;
    }

    public static void main(String[] args) {
	// write your code here
    }
}
