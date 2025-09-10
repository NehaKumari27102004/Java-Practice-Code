package Array;

import java.util.Scanner;
public class Challenge40NumberOfOccurrenceaArray {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the Array Occurrence");
        int [] numArr=ArrayUtility.inputArray();
        System.out.print("Now enter the number you want to find: ");
        int num=sc.nextInt();
        int occurrences=noOfOccurrences(numArr,num);
        System.out.println("Your element was found " + occurrences + "times in the Array.");
    }

    public static int noOfOccurrences(int[] numArr, int num){
        int occ=0;
        int i=0;
        while(i < numArr.length){
            if(numArr[i] ==num){
                occ++;
            }
            i++;
        }
        return occ;
    }
}
