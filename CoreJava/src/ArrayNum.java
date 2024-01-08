import java.util.Scanner;

public class ArrayNum 
{
	public static void main(String[] args)
	{
		int a[]= new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Element :");
		for(int i=0;i<a.length;i++)
		{
			a[i]= sc.nextInt();
		}
		int max=a[0];
		int min = a[0];
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
			 else if(min>a[i])
			 {
				 min=a[i];
			 }
		}
		System.out.println("Highest element is ="+max);
		System.out.println();
		System.out.println("smallest element is ="+min);
	
	}

}
