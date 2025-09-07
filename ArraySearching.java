package Array;

import java.util.Scanner;
public class ArraySearching {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr={2,3,4,5,6,8,9,10,55,66,87,98,23};
        System.out.println("Welcome top the Array seachinf");
        System.out.println("Please enter the number of the array:");
        int num=sc.nextInt();
        boolean isFound=isFound(arr, num);
        if(isFound){

            System.out.println("Your number was found in the Array ");
        }else{
            System.out.println("Your number is not found in the Array");
        }
    }

    public static boolean isFound(int[]arr, int num){
        int index=0;
        while(index < arr.length){
            if(arr[index] == num){
                return true;
            }
            index++;
        }
        return false;
    }

}
