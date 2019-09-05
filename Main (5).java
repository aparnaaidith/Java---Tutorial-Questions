import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
	    int num, result = 1;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number : ");
	    num = sc.nextInt();
	    if(num == 0)
	    {
	        result = 1;
	    }
	    else
	    {
		    for(int i=num;i>=1;i--)
		    {
		           result = result*i;
		    }
	    }
	    System.out.println("The result is : "+result);
		
	}
	
}
