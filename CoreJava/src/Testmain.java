
public class Testmain 
{
	public static void main(String[] args) 
	{
		Calculator_operation.add();//Static Method Call
		Calculator_operation obj=new Calculator_operation();
		obj.sub();
		System.out.println(obj.mul(10,20));
		obj.div(20, 10);
		System.out.println(obj.mod());
		int p=obj.addReturn(10, 20);
		System.out.println(p);
		String g=obj.method();
		System.out.println(g);
		//Revnumber r=new Revnumber();
	//	int s=r.revNum(123);
		Revnumber pall=new Revnumber();
		System.out.println(pall.palli(531));
		Encapsulation_1  E=new Encapsulation_1();
		E.setId(102);
		System.out.println(E.getId());
		E.setName("Ankita Gomkar");
		System.out.println(E.toString());
		System.out.println(E.getname());
	
	}
}

