
public class Revnumber 
{
	public int revNum(int x)
	{
		int n=x;
		int r;
		int sum=0;
		while(n>0)
		{
			r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		return sum;
	}
	public boolean palli(int x)
	{
		int p=x;
		int temp=p;
		Revnumber r=new Revnumber();
		int s=r.revNum(p);
		System.out.println(s);
		if(s==temp)
		{
			return true;
		}
		else
		{
			return false;
		}

	}
	
}
