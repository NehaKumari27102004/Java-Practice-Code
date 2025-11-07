import java.util.*;

public class AbsoluteTernary {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Welcome to find the absolute number:-");
        System.out.println("Please enter the number:");
        int num=sc.nextInt();
        int result= num >= 0 ? num : -num ;
        System.out.println(result + " is a absolute value");
    }
}
