import java.util.Scanner;

class Main
{
  public static void main(String args[])
  {
    int num1;
    int num2;
    int num3;
    int temp,result;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number : ");
    num1 = sc.nextInt();
    System.out.println("Enter the second number : ");
    num2 = sc.nextInt();
    System.out.println("Enter the third number : ");
    num3 = sc.nextInt();
    
    if(num1>num2)
    {
        temp = num1;
        if( temp>num3)
        {
            result = temp;
            System.out.println("The largest number is "+result);
        }
        else
        {
            System.out.println("The largest number is "+num3);
        }
    }
    else
    {
        temp = num2;
        if(temp>num3)
        {
            result = temp;
            System.out.println("The largest number is "+result);
        }
        else
        {
            System.out.println("The largest number is "+num3);
        }
            
        }
    }
    
    
}
