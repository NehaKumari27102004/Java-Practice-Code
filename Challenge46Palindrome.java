package Array;

import java.util.Scanner;
public class Challenge46Palindrome {
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome ");
        int[] numArr=ArrayUtility.inputArray();
        boolean isPalin= isPalindrome(numArr);
        if(isPalin){
            System.out.println("Your Array is a Palindrome");
        }else{
            System.out.println("Your Array is not a Palindrome");

        }
    }

    public static boolean isPalindrome(int[] numArr){
        int i=0;
        while(i < numArr.length/ 2){
            if(numArr[i] !=numArr[numArr.length-1-i]){
                return false;
            }
            i++;
        }
        return true;
    }
}
