package Arrays;

import java.util.Scanner;
public class Challenge36Fibonacciseries {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the Fibonacci Series:");
        System.out.print("Please enter the num:");
        int num=sc.nextInt();
        System.out.println("The result of a Fibonacci series is a : ");
        fibonacci(num);
    }
    public static void fibonacci(int num){
        if(num < 0) return;
        System.out.print(" 0");
        if(num == 0) return;
        System.out.print(" 1 ");

        int first=0, second=1;
        while(first + second <= num){
            int third =first + second;
            System.out.print(third +" ");
            first = second;
            second = third;
        }

    }
}
