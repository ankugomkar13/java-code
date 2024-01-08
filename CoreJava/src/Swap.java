import java.util.Scanner;

public class Swap {
	
	public static void main(String[] args)
	{
		int num1,num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value in num1 : ");
		num1=sc.nextInt();
		System.out.println("enter a value in num2 : ");
		num2=sc.nextInt();
		System.out.println("number before swaping "+num1+"   "+num2);
		num1 = num1+num2;
		num2=num1-num2;
		num1 = num1-num2;
		System.out.println("number After swaping "+num1+"    "+num2);
	}

}
