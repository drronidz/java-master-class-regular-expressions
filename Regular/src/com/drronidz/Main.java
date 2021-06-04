package com.drronidz;/*
    CREATED BY : ABD EL HALIM
    PROJECT NAME : {IntelliJ IDEA}
    CREATED ON : 6/4/2021 , 
    CREATED ON : 2:55 PM
*/

public class Main {
    public static void main(String[] args) {

        String string = "I am a string. Yes, I am.";
        System.out.println(string);

        String yourString = string.replaceAll("I", "You");
        System.out.println(yourString);

        String alphanumeric = "abcDeeeF12GhhabcDeeeiiiijkl99z";
        System.out.println(alphanumeric.replaceAll(".","Y"));

        // only at the start of string
        System.out.println(alphanumeric.replaceAll("^abcDeee", "YYY"));

        System.out.println(alphanumeric.matches("^hello"));
        System.out.println(alphanumeric.matches("^abcDeee"));
        System.out.println(alphanumeric.matches("^abcDeeeF12GhhabcDeeeiiiijkl99z"));

        System.out.println(alphanumeric.replaceAll("ijkl99z$", "THE END"));
        System.out.println(alphanumeric.replaceAll("[aei]", "X"));
        System.out.println(alphanumeric.replaceAll("[aei]", "I replaced a letter here"));
        System.out.println(alphanumeric.replaceAll("[aei][Fj]", "I replaced a letter here"));
    }
}
