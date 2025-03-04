package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static boolean isPalindrome(int number) {
        int originalNumber=Math.abs(number);
        int reverseNumber=0;


        while (originalNumber>0){
            int lastDigit=number %10;
            reverseNumber=reverseNumber * 10+lastDigit;
            originalNumber/=10;
        }
        return originalNumber==reverseNumber;
    }
public static boolean isPerfectNumber(int number){
        if (number<0){
            return false;
        }
        int sum=0;

        for (int i=1; i<=number/2; i++) {
            if(number % i ==0){
                sum+=i;
            }
        }
        return sum==number;
}

}
