package com.training;

public class Donor {
    private String donorID;
	private String donorName;
	private int donorAge;
	private String bloodtype;
	
	public Donor(String donorID, String donorName, int donorAge,
			String bloodtype) {
		super();
		this.donorID = donorID;
		this.donorName = donorName;
		this.donorAge = donorAge;
		this.bloodtype = bloodtype;
	} 
	public Donor() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public String getDonorID() {
		return donorID;
	}


	public void setDonorID(String donorID) {
		this.donorID = donorID;
	}


	public String getDonorName() {
		return donorName;
	}


	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}


	public int getDonorAge() {
		return donorAge;
	}


	public void setDonorAge(int donorAge) {
		this.donorAge = donorAge;
	}


	public String getBloodtype() {
		return bloodtype;
	}


	public void setBloodtype(String bloodtype) {
		this.bloodtype = bloodtype;
	}


	

	
	
	

	

}
