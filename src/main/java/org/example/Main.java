package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("------***  isPalindrome  ***-------");
        printPalindromeCheck(-1221);
        printPalindromeCheck(707);
        printPalindromeCheck(11212);
        printPalindromeCheck(0);
        printPalindromeCheck(1999999991);
        printPalindromeCheck(444);
        printPalindromeCheck(345);
        System.out.println("--------***  isPerfect  ***--------");
        printPerfectCheck(6);
        printPerfectCheck(28);
        printPerfectCheck(5);
        printPerfectCheck(-1);
        printPerfectCheck(-28);
        printPerfectCheck(496);
        printPerfectCheck(33550336);
        System.out.println("--------***  numberToWords  ***--------");
        printNumberToWords(123);
        printNumberToWords(1010);
        printNumberToWords(-1);
        printNumberToWords(10);
        printNumberToWords(1574);
        printNumberToWords(181724);
    }
    /*--------------------***   IS PALINDROME   ***---------------------*/
    public static boolean isPalindrome(int number) {
        number = Math.abs(number);
        char[] digits = Integer.toString(number).toCharArray();
        for (int i = 0 ; i < digits.length/2 ; i++) {
            if (digits[i] != digits[digits.length-1-i]) {
                return false;
            }
        }
        return true;
    }

    public static void printPalindromeCheck(int number) {
        System.out.println("Is (" + number + ") palindrome? " + isPalindrome(number));
    }

    /*------------------***   IS PERFECT   ***----------------------*/
    public static boolean isPerfectNumber(int number) {
        if ( number < 0 ) {
            return false;
        }
        int digitsSum=0;
        for ( int i = 1; i<= number/2; i++) {
            if (number % i == 0) {
                digitsSum += i;
            }
        }
        return digitsSum == number ? true : false;
        // turnery if can be used but " digitsSum == number " is simplified.
    }

    public static void printPerfectCheck(int number) {
        System.out.println("Is (" + number + ") a perfect number? " + isPerfectNumber(number));
    }
    /*---------------------***   DIGITS to WORDS   ***----------------------*/
    public static String numberToWords(int number) {
        if ( number < 0) {
            return "Invalid Value";
        }
        char[] digits = String.valueOf(number).toCharArray();
        String numToText = "";
        for (char digit : digits) {
            switch (digit) {
                case '0':
                    numToText +=("Zero ");
                    break;
                case '1':
                    numToText +=("One ");
                    break;
                case '2':
                    numToText +=("Two ");
                    break;
                case '3':
                    numToText +=("Three ");
                    break;
                case '4':
                    numToText +=("Four ");
                    break;
                case '5':
                    numToText +=("Five ");
                    break;
                case '6':
                    numToText +=("Six ");
                    break;
                case '7':
                    numToText +=("Seven ");
                    break;
                case '8':
                    numToText +=("Eight ");
                    break;
                case '9':
                    numToText +=("Nine ");
                    break;
                default:
                    break;
            }
        }
        return numToText.trim();
    }
    public static void printNumberToWords(int number) {
        System.out.println(number + " converted to words as this: " + numberToWords(number));
    }
}
