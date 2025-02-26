package Encapsulation.CodingQuestion;
public class SwaptwoNumber {
    public static void main(String[] args)
    {
        int a=10;
        int b=20;
        System.out.println("Before the swap a is " + a );
        System.out.println("Before the swap b is " + b );

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after the swap a is "+ a);
        System.out.println("and after the swap b is "+b);

    }
}
