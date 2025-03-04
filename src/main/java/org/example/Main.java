package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static boolean isPalindrome(int number) {
        int originalNumber=Math.abs(number);
        int reverseNumber=0;
        int temp = originalNumber;


        while (temp>0){
            int lastDigit=temp %10;
            reverseNumber=reverseNumber * 10+lastDigit;
            temp/=10;
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

public static String numberToWords(int number){
        if (number<0){
            return "Invalid Value";
        }
        if (number==0){
            return "Sıfır";
        }

    String word = "";
    String result = "";
    int num = number;

    while (num>0){
        int digit =num % 10;

        switch (digit) {
            case 0:
                word = "Zero";
                break;
            case 1:
                word = "One";
                break;
            case 2:
                word = "Two";
                break;
            case 3:
                word = "Three";
                break;
            case 4:
                word = "Four";
                break;
            case 5:
                word = "Five";
                break;
            case 6:
                word = "Six";
                break;
            case 7:
                word = "Seven";
                break;
            case 8:
                word = "Eight";
                break;
            case 9:
                word = "Nine";
                break;
            default:
                word = ""; // Should not happen, but for safety
                break;
        }

        result = word + " " + result;
        num/=10;
    }
return result.trim();

}
}
