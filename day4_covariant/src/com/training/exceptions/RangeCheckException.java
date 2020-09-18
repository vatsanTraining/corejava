package com.training.exceptions;

public class RangeCheckException extends Exception {

	public RangeCheckException(String message) {
		super(message);
		System.err.println(message);
		// TODO Auto-generated constructor stub
	}

}
