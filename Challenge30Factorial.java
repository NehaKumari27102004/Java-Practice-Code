package Arrays;

import java.util.*;
public class Challenge30Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        long fact=factorial(num);
        System.out.println("factorial is a: " + fact);
    }
    public static long factorial(int num){
        if(num<=2){
            return 1;
        }
        long fact=1;
        int i=2;
        while(i<=num){
            fact *=i;
            i++;
        }
        return fact;
    }
}
