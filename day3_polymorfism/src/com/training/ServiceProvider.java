package com.training;

public abstract class ServiceProvider {

	private long phoneNumber;
	private String firstNmae;
	public ServiceProvider(long phoneNumber, String firstNmae) {
		super();
		System.out.println("super class constructor called");
		this.phoneNumber = phoneNumber;
		this.firstNmae = firstNmae;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getFirstNmae() {
		return firstNmae;
	}
	public void setFirstNmae(String firstNmae) {
		this.firstNmae = firstNmae;
	}
	
	
	public abstract double calculateFees() ;
}
