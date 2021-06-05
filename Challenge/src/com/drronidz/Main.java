package com.drronidz;/*
    CREATED BY : ABD EL HALIM
    PROJECT NAME : {IntelliJ IDEA}
    CREATED ON : 6/5/2021 , 
    CREATED ON : 12:49 AM
*/

import javafx.css.Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String challengeOne = "I want a bike.";
        System.out.println(challengeOne.matches("I want a bike."));

        String regExOne = "I want a \\w+.";
        System.out.println(challengeOne.matches(regExOne));

        String challengeTwo = "I want a ball.";
        System.out.println(challengeTwo.matches(regExOne));

        String regExTwo = "I want a (bike|ball).";
        System.out.println(challengeOne.matches(regExOne));
        System.out.println(challengeTwo.matches(regExTwo));

        String challengeThree = "I want a blablablablalala.";
        System.out.println(challengeThree.matches(regExOne));

        String regExThree = "I want a \\w+.";
        Pattern pattern = Pattern.compile(regExThree);
        Matcher matcher = pattern.matcher(challengeOne);
        System.out.println(matcher.matches());

        matcher = pattern.matcher(challengeTwo);
        System.out.println(matcher.matches());

        String challengeFour = "Replace all blanks with underscores.";
        System.out.println(challengeFour.replaceAll(" ", "_"));
        System.out.println(challengeFour.replaceAll("\\s", "_"));

        String challengeFive = "aaabccccccccdddefffg";
        System.out.println(challengeFive.matches("[abcdefg]+"));
        System.out.println(challengeFive.matches("[a-g]+"));

        System.out.println(challengeFive.matches("^a{3}bc{8}d{3}ef{3}g"));
        System.out.println(challengeFive.replaceAll("^a{3}bc{8}d{3}ef{3}g", "REPLACED"));

        String challengeSeven = "abcd.135";
        System.out.println(challengeSeven.matches("[A-z][a-z]+\\.\\d+$"));

        String challengeEight = "abcd.135uvqz.7tzik.999";
        Pattern patternEight = Pattern.compile("[A-Za-z]+\\.(\\d+)");
        Matcher matcherEight = patternEight.matcher(challengeEight);

        while (matcherEight.find()) {
            System.out.println("Occurrence: " + matcherEight.group(1));
        }
        String challengeNine = "abcd.135\tuvqz.7\ttzik.999\n";
        Pattern patternNine = Pattern.compile("[A-Za-z]+\\.(\\d+)\\s");
        Matcher matcherNine = patternNine.matcher(challengeNine);
        while (matcherNine.find()) {
            System.out.println("Occurrence: " + matcherNine.group(1));
        }

        String challengeTen = "abcd.135\tuvqz.7\ttzik.999\n";
        Pattern patternTen = Pattern.compile("[A-Za-z]+\\.(\\d+)\\s");
        Matcher matcherTen = patternTen.matcher(challengeTen);
        while (matcherTen.find()) {
            System.out.println("Occurrence: start = " + matcherTen.start(1) + " end = " + (matcherTen.end(1) - 1));
        }
        System.out.println("------------------------------------------------------");
//        String challengeEleven = "{0, 2}, {0, 5}, {1, 3}, {2, 4}";
        String challengeEleven = "{0, 2}, {0, 5}, {1, 3}, {2, 4} {x, y}, {5, 6}, {11, 15}";
//        Pattern patternEleven = Pattern.compile("\\{(.+?)\\}");
        Pattern patternEleven = Pattern.compile("\\{(\\d+, \\d+)\\}");
        Matcher matcherEleven = patternEleven.matcher(challengeEleven);
        while (matcherEleven.find()) {
            System.out.println("Occurrence: " + matcherEleven.group(1));
        }

        System.out.println("------------------------------------------------------");
        String challengeTwelve = "11111";
        System.out.println(challengeTwelve.matches("^\\d{5}$"));

        System.out.println("------------------------------------------------------");
        String challengeThirteen = "11111-1111";
        System.out.println(challengeThirteen.matches("^\\d{5}-\\d{4}$"));

        System.out.println("------------------------------------------------------");

    }
}
