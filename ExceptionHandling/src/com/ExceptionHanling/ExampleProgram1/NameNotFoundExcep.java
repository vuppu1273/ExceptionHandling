package com.ExceptionHanling.ExampleProgram1;

public class NameNotFoundExcep extends RuntimeException{
	
	// In a child class created the variable which is causing an exception 

	private String Msg =  null;
	
	
	//Creating a Default Constructor
	
	public NameNotFoundExcep() {
		
	}
	
	
	// Creating a Parameterized Constructor 
	public NameNotFoundExcep(String value) {
		this.Msg = value;
		
	}
		
	

	public String getMsg() {
		return Msg;
	}

	public void setMsg(String msg) {
		Msg = msg;
	}

}
