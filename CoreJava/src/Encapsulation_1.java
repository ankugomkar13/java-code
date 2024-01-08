
public class Encapsulation_1 
{
	private int id;
	private String name;
	@Override
	public String toString() //Use to Print Object
	{
		return "Encapsulation_1 [id=" + id + ", name=" + name + "]";
	}
	public void setId(int id) //parameterized method with return type
	{
		this.id=id;
	}
	public int getId() //non parameterized with return type
	{
		return id;
	}
	public void setName(String Name) //parameterized method with return type
	{
		this.name=Name;
	}
	public String getname() //non parameterized with return type
	{
		return name;
	}
	 
	
}
