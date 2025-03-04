package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static boolean isPalindrome(int number) {
        int originalNumber=Math.abs(number);
        int reverseNumber=0;
        int temp=originalNumber;

        while (temp>0){
            int lastDigit=number %10;
            reverseNumber=reverseNumber * 10+lastDigit;
            temp/=10;
        }
        return originalNumber==reverseNumber;

    }
}
