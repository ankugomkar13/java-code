class student
{
	String Name;
	int Roll;
	static	String School ="softtronix";
	
	student(String std_name,int roll_no,String School_name) 
	{
		Name=std_name;
		Roll =roll_no;
	
	}
	
	@Override
	public String toString() {
		return "student [Name=" + Name + ", Roll=" + Roll + ", School=" + School + "]";
	}

	public student() 
	{
		School="softtronix";
	}
	
}
public class school
{
	public static void main(String[] args)
	{
		
		student s1=new student("Ankita",12,"Shreyas");
//		System.out.println(s1);
		System.out.println(s1.toString());
	//	student s2=new student("Ranu",1);
		String s=null;
	//	s.equals("");
	//	s.trim();
		student s2=new student();
		System.out.println(s2);
		
		
		
		
	}
}
