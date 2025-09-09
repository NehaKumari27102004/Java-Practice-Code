package Array;

import java.util.Scanner;

public class SumAndAverage  {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Array sum and average");
        System.out.print("Please enter the number of elements:");
        int size=sc.nextInt();
        int[] numArray=new int[size];
        int i=0;
        while(i < size){
            System.out.println("Please enter element no" + (i+1)+ ":");
            numArray[i] = sc.nextInt();
            i++;
        }
        long sum=sum(numArray);
        int avg = average(numArray);
        System.out.println("Sum of the number is:" + sum);
        System.out.println("Average of the number is:" + avg);

    }

    public static long sum(int [] numArray){
        long sum=0;
        int i=0;
        while(i < numArray.length){
            sum += numArray[i];
            i++;
        }
        return sum;
    }

    public static int average(int[] numArray){
        long sum= sum(numArray);
        return (int)(sum / numArray.length);
    }
}
