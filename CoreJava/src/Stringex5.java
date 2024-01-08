
public class Stringex5 
{
	public static void main(String[] args) 
	{
		String name="Hello";
		String Lname="hello";
		String Mname="   Ankita   " ;
		System.out.println(name.equals(Lname));
		System.out.println(name.equalsIgnoreCase(Lname));
		System.out.println(Mname.trim());
		String num1="8";
		String num2="8";
		int new_number=Integer.parseInt(num1);
		int new2_number=Integer.parseInt(num2);
		System.out.println(new_number+new2_number);
		num1=new_number+"";
		num2=String.valueOf(new2_number);
		
	}
}
