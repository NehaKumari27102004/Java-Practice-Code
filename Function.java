package Arrays;

import java.util.*;
public class Function {
    public static void main(String[] args){
        greeting();
        printFirstPattern();
    }
    public static void printFirstPattern(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a number:");
        int num=sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void greeting(){
        System.out.println("Good Morning");
    }
}
