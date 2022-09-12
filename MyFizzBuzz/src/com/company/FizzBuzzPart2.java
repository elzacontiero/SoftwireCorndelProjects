package com.company;

public class FizzBuzzPart2 {

    static String applyRules(int n) {
        if (n%3==0 && n%5==0) {
            return "FizzBuzz";
        }
        if (n%3==0 && n%7==0) {
            return "FizzBang";
        }
        else if (n%5==0 && n%7==0) {
            return "BuzzBang";
        }
        else if(n%7==0) {
            return "Bang";
        }
        else if (n%3 == 0) {
            return "Fizz";
        }
        else if (n%5 == 0) {
            return "Buzz";
        }
        else if (n%11 == 0) {
            return "Bong";
        }
        else if (n%13 == 0) {
            return "Fezz";
        }
        else {
            return Integer.toString(n);
        }
    }

    public static void main(String[] args) {
        for(int n=1; n<=100; n++) {
            String result = applyRules(n);
            System.out.println(result);
        }
    }
}

