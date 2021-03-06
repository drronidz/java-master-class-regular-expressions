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
        htmlText.append("<p>This is a paragraph about something.</p>");
        htmlText.append("<p>This is another paragraph about something else.</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>Here is the summary.</p>");

        String h2Pattern = "<h2>";
        Pattern pattern = Pattern.compile(h2Pattern);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());

        matcher.reset();
        int count = 0;
        while (matcher.find()) {
            count++;
            System.out.println("Occurrence " + count + " : " + matcher.start() + " to " + matcher.end());
        }
        // Opening tag & Closing tag & everything between

        String h2GroupPattern = "(<h2>.*?</h2>)";
        Pattern groupPattern = Pattern.compile(h2GroupPattern);
        Matcher groupMatcher = groupPattern.matcher(htmlText);
        System.out.println(groupMatcher.matches());
        groupMatcher.reset();

        while (groupMatcher.find()) {
            System.out.println("Occurrence: " + groupMatcher.group(1));
        }
        System.out.println("-----------------------------------------------------------\n");

        String h2TextGroups = "(<h2>)(.+?)(</h2>)";
        Pattern h2TextPattern = Pattern.compile(h2TextGroups);
        Matcher h2TextMatcher = h2TextPattern.matcher(htmlText);

        while (h2TextMatcher.find()) {
            System.out.println("Occurrence: " + h2TextMatcher.group(2));
        }
        System.out.println("-----------------------------------------------------------\n");
        // "abc" "a" and "b" and "c"
        // [[Hh]arry
        System.out.println("harry".replaceAll("[H|h]arry", "Larry"));
        System.out.println("Harry".replaceAll("[H|h]arry", "Larry"));

        // [^abc]
        String tvTest = "tstvtkt";
//        String tNotVRegExp = "t[^v]";
        String tNotVRegExp = "t(?!v)";
        Pattern tNotVPattern = Pattern.compile(tNotVRegExp);
        Matcher tNotVMatcher = tNotVPattern.matcher(tvTest);

        count = 0;
        while (tNotVMatcher.find()) {
            count++;
            System.out.println("Occurrence " + count + " : " + tNotVMatcher.start() + " to " + tNotVMatcher.end());
        }

        System.out.println("-----------------------------------------------------------\n");
        // t(?=v)
        // ^([\(]{1}[0-9]{3}[\)]{1}[ ]{1}[0-9]{3}[\-]{1}[0-9]{4})$

        String phoneOne = "1234567890"; // Shouldn't match
        String phoneTwo = "(123) 456-7890"; // Should match
        String phoneThree = "123 456-7890"; // Shouldn't match
        String phoneFour = "(123)456-7890"; // Shouldn't match

        System.out.println("phoneOne = " + phoneOne.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phoneTwo = " + phoneTwo.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phoneThree = " + phoneThree.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phoneFour = " + phoneFour.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));

        System.out.println("-----------------------------------------------------------\n");

        //^4[0-9]{12}([0-9]{3})?$

        String visaOne = "4444444444444"; // should match
        String visaTwo = "5444444444444"; // shouldn't match
        String visaThree = "4444444444444444";  // should match
        String visaFour = "4444";  // shouldn't match

        System.out.println(" visaOne " + visaOne.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println(" visaTwo " + visaTwo.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println(" visaThree " + visaThree.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println(" visaFour " + visaFour.matches("^4[0-9]{12}([0-9]{3})?$"));



    }
}
