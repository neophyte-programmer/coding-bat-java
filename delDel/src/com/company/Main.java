package com.company;


//Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted.
// Otherwise, return the string unchanged.
//
//
//        delDel("adelbc") → "abc"
//        delDel("adelHello") → "aHello"
//        delDel("adedbc") → "adedbc"

public class Main {
    static String delDel(String str) {
        if (str.length() >= 4) {
            String threeChar = str.substring(1, 4);
            boolean hasDel = threeChar.equals("del");
            String newStr = str;
            if (hasDel) {
                newStr = str.replaceFirst("del", "");
                return newStr;
            }
            return str;
        }

        return str;
    }
    public static void main(String[] args) {
	// write your code here

        String input = delDel("adelHello");
        System.out.println(input);
    }
}
