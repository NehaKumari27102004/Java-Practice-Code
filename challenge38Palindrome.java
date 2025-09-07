package Arrays;

import java.util.Scanner;
public class challenge38Palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the Palindrome Checker:");
        System.out.print("Please enter the your number:");
        int num = sc.nextInt();
        boolean isPalindrome = isPalindrome(num);
        if(isPalindrome){
            System.out.println("Your number is a Palindrome");
        }else{
            System.out.println("Your number is not a Palindrome");
        }
    }

    public static boolean isPalindrome(int num){
        int reverse = reverse(num);
        return num == reverse;

    }
    public static int reverse(int num){
        int newnum=0;
        while(num > 0){
            int digit=num % 10;
            newnum= newnum * 10 + digit;
            num /=10;
        }
        return newnum;
    }
}
