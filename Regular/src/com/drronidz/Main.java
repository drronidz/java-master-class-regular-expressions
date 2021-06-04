package com.drronidz;/*
    CREATED BY : ABD EL HALIM
    PROJECT NAME : {IntelliJ IDEA}
    CREATED ON : 6/4/2021 , 
    CREATED ON : 2:55 PM
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

        System.out.println("-----------------------------------------------------------\n");
        String thirdAlphanumericString = "abcDeeeF12GhhabcDeeeiiiijkl99z";
        System.out.println(thirdAlphanumericString.replaceAll("^abcDe{3}", "YYY"));
        System.out.println(thirdAlphanumericString.replaceAll("^abcDe+", "YYY"));
        System.out.println(thirdAlphanumericString.replaceAll("^abcDe*", "YYY"));
        System.out.println(thirdAlphanumericString.replaceAll("^abcDe{2,5}","YYY"));
        System.out.println(thirdAlphanumericString.replaceAll("h+i*j", "Y"));

        System.out.println("-----------------------------------------------------------\n");

        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");

        htmlText.append("<h2>Sub-heading</h2>");
        htmlText.append("<p> This is a paragraph about something.</p>");
        htmlText.append("<p> This is a another paragraph about something else.</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p> Here is the summary.</p>");

        String h2Pattern = ".*<h2>.*";
        Pattern pattern = Pattern.compile(h2Pattern);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());


    }
}
