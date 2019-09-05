import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
	    int a = 0, b = 1,c,num;
	    int result = 1;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number : ");
	    num = sc.nextInt();
	    System.out.print(a+" "+b+" ");
	    for(int i=0;i<=num;i++)
	    {
	        c = a+b; 
	        a=b;
	        b=c;
	        System.out.print(c+" ");
	    }
	    
	}
	
}
