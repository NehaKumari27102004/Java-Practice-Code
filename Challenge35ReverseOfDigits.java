package Arrays;

import java.util.Scanner;

public class Challenge35ReverseOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the Reverse of Digits");
        System.out.print("Please enter the number:");
        int num=sc.nextInt();
        int reverse=reverse(num);
        System.out.println("After reverse the Number of Digits are:" + reverse);
    }

    public static int reverse(int num){
        int newNum=0;
        while(num>0){
           int Digit=num % 10;
            newNum=newNum * 10 +Digit;
            num /=10;
        }
        return newNum;

    }
}
