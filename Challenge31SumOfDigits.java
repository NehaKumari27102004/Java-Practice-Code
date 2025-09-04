package Arrays;

import java.util.*;

public class Challenge31SumOfDigits {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Sum Of Digits");
        System.out.println("Please enter the your number:");
        int num=sc.nextInt();
        int sum=SumOfDigits(num);
        System.out.println("Sum of the Digits are: " + sum);
    }
    public static int SumOfDigits(int num){
        int sum=0;
        while(num >0){
            sum=sum +(num %10);
            num /=10;
        }
        return sum;
    }
}
