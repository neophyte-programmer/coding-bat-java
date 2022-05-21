package com.company;


//Given a string, return true if the string starts with "hi" and false otherwise.
//
//        startHi("hi there") → true
//        startHi("hi") → true
//        startHi("hello hi") → false

public class Main {
    static boolean startHi(String str) {
        if (str.length() > 1){
            String firstTwo = str.substring(0,2);
            boolean isEqual = firstTwo.equals("hi");
            if (isEqual) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
       boolean word = startHi("hello");
       if (word) {
           System.out.println("True");
       }
       else {
           System.out.println("False");
       }
    }


}
