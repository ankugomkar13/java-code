
public class Calculator_operation 
{
	public static void add() //static Method
	{
		System.out.println("******Addition Method Call*******");
		int a=20;
		int b=30;
		int c=a+b;
		System.out.println("Addition of Two number = "+c);
	}
	public void sub() //Normal Method
	{
		System.out.println("******Subtraction Method Call*******");
		int a=60;
		int b=40;
		int c=a-b;
		System.out.println("Subtraction of Two number = "+c);
	}
	public int  mul(int x,int y)  //Accept as well as return method
	{
		System.out.println("******Multiplication  Method Call*******");
		int a=x;
		int b=y;
		return a*b;
	}
	public void div(int a,int b) //Accept only not return anything
	{
		System.out.println("******Division Method Call*******");
		int x=a;
		int y=b;
		System.out.println(x/y);
	}
	public float mod() //not Accept only return method
	{
		System.out.println("******Modulo DIvision Method Call*******");
		int a=20;
		int b=30;
		return a%b;
	}
	public int addReturn(int x,int y)
	{
		System.out.println("Super Method Call");
		int doctor=x+y;
		return doctor;
		
	}
	public String method()
	{
		System.out.println("Non Parameterized with return type");
		String variablename="My Name is Lakhan";
		return variablename;
	}
}
