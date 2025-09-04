package Arrays;

import java.util.Scanner;
public class Challenge29 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to odd Sum");
        System.out.println("Please Enter the your number:");
        int num=sc.nextInt();
        int sum= oddSum(num);
        System.out.println("OssSum till "+ num+ " is:" + sum );
    }

    public static int oddSum(int num){
        int sum=0;
        for(int i=1; i<=num; i+=2 ){
            sum +=i;
        }
        return sum;
    }

}
