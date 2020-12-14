package com.training.Domain;

import java.io.Serializable;

public class CreditCard implements Serializable {

	private static final long serialVersionUID = 1L;
	private String holderName;
	private double accountNumber;
	private double holdingFees;
	private transient double creditLimit=1000.0;
	public CreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CreditCard(String holderName, double accountNumber, double holdingFees) {
		super();
		this.holderName = holderName;
		this.accountNumber = accountNumber;
		this.holdingFees = holdingFees;
	}

	public CreditCard(String holderName, double accountNumber, double holdingFees, double creditLimit) {
		super();
		this.holderName = holderName;
		this.accountNumber = accountNumber;
		this.holdingFees = holdingFees;
		this.creditLimit = creditLimit;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public double getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(double accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getHoldingFees() {
		return holdingFees;
	}
	public void setHoldingFees(double holdingFees) {
		this.holdingFees = holdingFees;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return holderName + ","+ accountNumber + ","+holdingFees;
	}
	
	
	
	

}
