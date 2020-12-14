package com.training.exceptions;

public class MyCustomExceptions extends Exception {

	public MyCustomExceptions(String message, Throwable cause) {
		super(message, cause);
		System.err.println(message+cause.getMessage());
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}

}
