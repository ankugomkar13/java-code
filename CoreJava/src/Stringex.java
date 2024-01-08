
public class Stringex 
{
	public static void main(String[] args) 
	{
		String str="Ankita";
		System.out.println(str);
		String str1="Gomkar";
		System.out.println(str+str1); //concatination
		System.out.println(str.concat(str1)); //pre define method for concatination of String
		//String is immutable class
		String str2=new String("My name is Ankita Gomkar,I am from Nagpur.");
		System.out.println(str2);
		
	}
}
