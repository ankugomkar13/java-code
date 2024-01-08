
public class VariableTyoe 
{
	static int instance_variable=10;
	public void display()
	{
		System.out.println("Hello World");
	}
	public static void main(String[] args) 
	{
		int ankita_vari=19;
		System.out.println(instance_variable);
		VariableTyoe object=new VariableTyoe();
		object.display();
	}
	static
	{
		System.out.println("excute during compile time");
	}
}
