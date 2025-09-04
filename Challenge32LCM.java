package Arrays;

import java.util.*;
public class Challenge32LCM {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Least Common Multiple:");
        System.out.println("Please enter your first number:");
        int num1=sc.nextInt();
        System.out.println("Please enter your second number:");
        int num2=sc.nextInt();
        int lcm=lcm(num1,num2);
        System.out.println("Lcm of the number is a :" + lcm);
    }

    public static int lcm(int num1 , int num2){
        int i=1;
        while(i<=num2){
            int factor= num1* i;
            if(factor % num2 ==0){
                return factor;
            }
            i++;
        }
        return 0;
    }
}
