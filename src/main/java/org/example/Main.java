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
        if ( digitsSum == number) {
            return true;
        }
        return false;
    }

    public static void printPerfectCheck(int number) {
        System.out.println("Is (" + number + ") a perfect number? " + isPerfectNumber(number));
    }
    /*---------------------***   DIGITS to WORDS   ***----------------------*/
    public static String numberToWords(int number) {
        if ( number < 0) {
            return "Invalid Value";
        }
        String numberStr = String.valueOf(number);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numberStr.length(); i++) {
            char character = numberStr.charAt(i);
            switch (character) {
                case '0':
                    result.append("Zero ");
                    break;
                case '1':
                    result.append("One ");
                    break;
                case '2':
                    result.append("Two ");
                    break;
                case '3':
                    result.append("Three ");
                    break;
                case '4':
                    result.append("Four ");
                    break;
                case '5':
                    result.append("Five ");
                    break;
                case '6':
                    result.append("Six ");
                    break;
                case '7':
                    result.append("Seven ");
                    break;
                case '8':
                    result.append("Eight ");
                    break;
                case '9':
                    result.append("Nine ");
                    break;
                default:
                    result.append("");
                    break;
            }
        }
        return result.toString().trim();
    }
    public static void printNumberToWords(int number) {
        System.out.println(number + " converted to words as this: " + numberToWords(number));
    }
}
