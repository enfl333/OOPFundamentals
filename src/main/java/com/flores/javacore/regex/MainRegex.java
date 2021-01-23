package com.flores.javacore.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainRegex {

    public MainRegex() {

            init();

    }

    private void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your regex: ");
        String patternRegex = scanner.next();
        System.out.println("Enter input string to search: ");
        String matcherStringFromInput = scanner.nextLine();


        Pattern pattern = Pattern.compile(patternRegex);
        Matcher matcher = pattern.matcher(matcherStringFromInput);
        System.out.println("pattern Regex:"+patternRegex+".");
        System.out.println("Input String: "+matcherStringFromInput+".");
        boolean found = false;



        while (matcher.find()){
            System.out.format("I found the text" +
                    " \"%s\" starting at " +
                    "index %d and ending at index %d.%n",matcher.group(),matcher.start(),matcher.end());
            found = true;
        }

        if(!found){
            System.out.format("No match found.%n");
        }

        scanner.close();
    }

    public static void main(String[] args) {
        new MainRegex();
    }
}
