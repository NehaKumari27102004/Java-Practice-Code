package Arrays;

import java.util.*;
public class Challenge34PrimeNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("welcome to check the given number is a Prime or not:");
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        boolean isPrime=isPrime(num);
        if (isPrime) {
            System.out.println("The given num is a Prime");
        }else{
            System.out.println("The given number is a not prime");
        }

    }
    public static boolean  isPrime(int num){
        int i=2;
        while(i <num){
            if(num % i ==0){
                return false;
            }
            i++;
        }
        return true;
    }
}
