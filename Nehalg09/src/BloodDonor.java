
public class BloodDonor {
 String name;
 int age;
 String bloodGroup;
 String place;
 
 	public BloodDonor()
 	{
 		
 	}
 
 
	public BloodDonor(String name,int age,String bloodGroup,String place)
	{
		this.name=name;
		this.age=age;
		this.bloodGroup=bloodGroup;
		this.place=place;
	
	}
	
	public void setname(String name)
	{
		this.name=name;
	}
	public void setage(int age)
	{
		this.age=age;
	}
	public void setbloodGroup(String bloodGroup)
	{
		this.bloodGroup=bloodGroup;
	}
	public void setplace(String place)
	{
		this.place=place;
	}
	
	public String getname()
	{
		return this.name;
	}
	
	public int getage()
	{
		return this.age;
	}

	public String getbloodGroup()
	{
		return this.bloodGroup;
	}
	
	public String getplace()
	{
		return this.place;
	}
}
