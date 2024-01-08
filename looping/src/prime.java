import java.util.Scanner;

public class prime 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number = ");
	    int num =sc.nextInt();
	    int count=0;
	    int i;
	    for(i=1;i<=num;i++)
	    {
	    	if(num%i==0)
	    	{
	    		count++;
	    	}
	    }
	    if(count==2)
	    {
	    	System.out.println( "num is prime number");
	    }
	    else
	    {
	    	System.out.println("num is prime not number");
	    }
	}
}
