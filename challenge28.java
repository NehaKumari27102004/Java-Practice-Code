package Arrays;

import java.util.Scanner;

public class challenge28 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Welcome to Multiplication Words\n");
        System.out.println("Please enter your number:");
        int num=sc.nextInt();
        printMultiplicationTable(num);
    }
    public static void printMultiplicationTable(int num){
        for(int i=1; i<=10; i++){
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}
