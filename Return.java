package Arrays;

import java.util.Scanner;
public class Return {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        greet();
        int first = readNumber();
        int second = readNumber();

        int sum=first + second;
        System.out.println("Sum of the numbers is:" + sum);
    }

    public static int readNumber(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter the number:");
        int number=sc.nextInt();
        return number;
    }

    public static void greet(){
        System.out.println("Welcome to Calculator\n");
    }

}
