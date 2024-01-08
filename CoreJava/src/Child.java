
public class Child extends Parents
{
	public void spendMoney( int amt)
	{
		a=a-amt;
		System.out.println("spend amt "+amt);
		System.out.println("Remaining Rs "+a);
	}
}
