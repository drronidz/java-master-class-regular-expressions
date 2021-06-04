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

        System.out.println("harry".replaceAll("[Hh]arry","Harry"));
        System.out.println("-----------------------------------------------------------");
        System.out.println(alphanumeric.matches("^abcDeeeF12GhhabcDeeeiiiijkl99z"));
        System.out.println(alphanumeric);
        System.out.println(alphanumeric.replaceAll("[^ej]","X"));
        System.out.println(alphanumeric.replaceAll("[abcdef345678]", "X"));
        System.out.println(alphanumeric.replaceAll("[a-fA-F3-8]","X"));
        System.out.println(alphanumeric.replaceAll("(?i)[a-f3-8]", "X"));
        System.out.println("-----------------------------------------------------------");
        System.out.println(alphanumeric);
        System.out.println(alphanumeric.replaceAll("[0-9]","X"));
        System.out.println(alphanumeric.replaceAll("\\d","X"));
        System.out.println(alphanumeric.replaceAll("\\D","X"));
        System.out.println("-----------------------------------------------------------");
        String hasWhiteSpace = "I have blanks and\ta tab, and also a newline\n";
        System.out.println(hasWhiteSpace);
        System.out.println(hasWhiteSpace.replaceAll("\\s",""));
        System.out.println(hasWhiteSpace.replaceAll("\t","X"));
//        System.out.println(hasWhiteSpace.replaceAll("\\S",""));
        System.out.println(hasWhiteSpace.replaceAll("\\w","X"));
        System.out.println(hasWhiteSpace.replaceAll("\\b","X"));
    }
}
