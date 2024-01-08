import java.util.Scanner;

public class Pallindrom {

	public static void main(String[] args)
	{
		String str; 
		String rev = ""; 
		Scanner scanner = new Scanner(System.in);  
		System.out.print("Please enter a string: ");  
		str = scanner.nextLine(); 
		for(int i = str.length()-1;i>=0;i--)
		{
			rev = rev+str.charAt(i);
		}
		System.out.println(rev);
		if(str.equals(rev))
		{
			System.out.println("this string is pallindrom");
		}
		else
		{
			System.out.println("this string is not pallindrom");
		}
	}
}
