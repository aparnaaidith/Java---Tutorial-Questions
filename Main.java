import java.util.Scanner;
public class Main
{
    public static int num1;
    public static int num2;
    public static int num3;
    public static int result,temp;
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the first number : ");
       num1 = sc.nextInt();
       System.out.println("Enter the second number : ");
       num2 = sc.nextInt();
       System.out.println("Enter the third number : ");
       num3 = sc.nextInt();
       
       temp = (num1 > num2)?num1:num2;
       result = (temp > num3)?temp:num3;
       
       System.out.println("The biggest number is :"+num3);
       
       
    }
}