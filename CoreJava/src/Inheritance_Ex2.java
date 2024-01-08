class Dad
{
	protected float amt=30000;
}
class Son extends Dad
{
	public void spendMoney()
	{
		amt=amt-10000;
		System.out.println(amt);
	}
}
public class Inheritance_Ex2 
{
	public static void main(String[] args) 
	{
		Son s=new Son();
		s.spendMoney();
	}
}
