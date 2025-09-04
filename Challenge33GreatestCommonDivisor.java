package Arrays;

import java.util.*;
public class Challenge33GreatestCommonDivisor {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the Challenge number 33:-");
        System.out.println("Enter your first number:");
        int num1=sc.nextInt();
        System.out.println("Enter your second number:");
        int num2=sc.nextInt();
        int gcd=gcd(num1,num2);
        System.out.println("Greatest Common Divisor of the number is a :" + gcd);
    }

    public static int gcd(int num1, int num2){
        int gcd=1;
        int i=2;
        int least=least(num1,num2);
        while(i<=least){
            if(num1 % i==0 && num2 % i==0){
                gcd=i;
            }
            i++;
        }
        return gcd;
    }

    public static int least(int num1, int num2){
        if(num1 < num2){
            return num1;
        }else{
            return num2;
        }
    }
}
