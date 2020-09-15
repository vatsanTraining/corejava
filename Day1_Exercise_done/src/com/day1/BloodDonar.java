package com.day1;

public class BloodDonar {

	private int donationNumber;
	private String bloodGroup;
	private String donarName;
	
	
	public BloodDonar() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public BloodDonar(int donationNumber, String bloodGroup, String donarName) {
		super();
		this.donationNumber = donationNumber;
		this.bloodGroup = bloodGroup;
		this.donarName = donarName;
	}


	public int getDonationNumber() {
		return donationNumber;
	}



	public void setDonationNumber(int donationNumber) {
		this.donationNumber = donationNumber;
	}



	public String getBloodGroup() {
		return bloodGroup;
	}



	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}



	public String getDonarName() {
		return donarName;
	}



	public void setDonarName(String donarName) {
		this.donarName = donarName;
	}

	
	
}
