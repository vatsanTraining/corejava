package com.training;

public class BloodDonor {
	public String Name;
	public int age;
	public String bloodGroup;
	
	
	public BloodDonor(String name, int age, String bloodGroup) {
		super();
		Name = name;
		this.age = age;
		this.bloodGroup = bloodGroup;
	}


	public String getName() {
		return Name;
	}

	public int getAge() {
		return age;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}


	public static void main(String[] args) {
	 BloodDonor bd =new BloodDonor("Rahul",45,"A+");
	 System.out.println(bd.getName()+" "+bd.getAge()+" "+bd.getBloodGroup());
	
	}

}
