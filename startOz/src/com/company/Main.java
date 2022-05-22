package com.company;


// Given a string, return a string made of the first 2 chars (if present),
// however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
//
//
//        startOz("ozymandias") → "oz"
//        startOz("bzoo") → "z"
//        startOz("oxx") → "o"

public class Main {
    static String startOz(String str) {
        if (str.length() > 1) {
            String firstChar = str.substring(0,1);
            String secondChar = str.substring(1,2);
            boolean isO = firstChar.equals("o");
            boolean isZ = secondChar.equals("z");

            if (isO && !isZ){
                return firstChar;
            }
            else if (!isO && isZ){
                return secondChar;
            }
            else if (isO && isZ){
                return firstChar + secondChar;
            }
            else if (!(isO && isZ)){
                return "";
            }
        }
        return str;
    }

    public static void main(String[] args) {
	// write your code here
        String input = startOz("abc");
        System.out.println(input);
    }
}
