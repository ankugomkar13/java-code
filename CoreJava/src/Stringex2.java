
public class Stringex2 
{
	public static void main(String[] args)
	{
		String str="Ankita"; //String constant pool
		String str1=new String("Ranu");//Heap as well as String constant pool.
		String str2="Ankita";
		String str3=new String("ranu");
		if(str1==str3) //work on memory location
		{
			System.out.println("Hello");
		}
		else
		{
			System.out.println("World");
		}
		if(str1.equals(str3))  //work on value inside the object
		{
			System.out.println("Ankita");
		}
		else
		{
			System.out.println("Gomkar");
		}
		if(str1.equalsIgnoreCase(str2))
		{
			System.out.println("not all");
		}
		else
		{
			System.out.println("all");
		}
				
	}
}
