import java.util.Scanner;

public class SwapString 
{
	public static void main(String[] args)
	{
		String str1,str2; 
		Scanner scanner = new Scanner(System.in);  
		System.out.print("Please enter a str1: ");  
		str1 = scanner.nextLine(); 
		System.out.print("Please enter a str2: ");  
		str2 = scanner.nextLine(); 
		System.out.println("String before swaping "+str1+"   "+str2);
		str1=str1+str2;
		str2=str1.substring(0,str1.length()-str2.length());
		str1=str1.substring(str2.length());
		System.out.println("String After swaping "+str1+"   "+str2);
	}

}
