import java.util.*;
public class Candidate {
 
	public static void main(String args[])
	{
		BloodDonor b1=new BloodDonor();
		b1.setname("Nehal");
		b1.setage(21);
		b1.setbloodGroup("A+");
		b1.setplace("Haryana");
		
		BloodDonor b2=new BloodDonor("Abhi",22,"B+","UP");
		System.out.println(b1.getname());
		System.out.println(b1.getage());
		System.out.println(b1.getbloodGroup());
		System.out.println(b1.getplace());
		
				
		
		
	}
}
