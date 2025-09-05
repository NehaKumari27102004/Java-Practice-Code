package Arrays;

import java.util.Scanner;
public class Challenge37ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the ArmStrong Number:");
        System.out.print("Please enter your number");
        int num=sc.nextInt();
        boolean isArmStrong= isArmstrong(num);
        if(isArmStrong){
            System.out.println("Your number is a ArmStrong");
        }else{
            System.out.println("Your number is not a Armstrong");
        }
    }
    public static boolean isArmstrong(int num){

        int noOfDigits= noOfDigits(num);
        System.out.println("No of Digits:" + noOfDigits);
        int finalNumber=0;
        while(num >0){
            int lastDigit=num%10;
            num /=10;
            finalNumber += power(lastDigit, noOfDigits);
        }
        System.out.println("Final number is:" + finalNumber);
        return finalNumber==num;
    }

    public static int power(int num1, int num2){
        int result=num1;
        int i=1;
        while(i < num2){
            result *= num1;
            i++;
        }
        System.out.println("Power of" + num1 + "is" + result );
        return result;
    }

    public static int noOfDigits(int num){
        int digits=0;
        while(num >0){
            digits++;
            num /=10;
        }
        return digits;
    }
}
