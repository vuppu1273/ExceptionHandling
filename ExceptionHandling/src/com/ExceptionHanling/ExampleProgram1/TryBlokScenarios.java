package com.ExceptionHanling.ExampleProgram1;

import java.rmi.AccessException;

public class TryBlokScenarios {

	public static void main(String[] args) {
		
		 // TODO Auto-generated method stub
		
		//Try Catch blocks Different scenarios we can see in real time 
		/*
		 * 
		try {
			//A try block will not exists on it own it need to have at least one catch block
		}*/
		
		
		//  1 Regular try catch block
		
		try {
			
		}catch(Exception e){
			
		}
		//  2 One try with multiple catch blocks
		try {
			
		}catch(ArithmeticException e) {
			
		}
		catch(Exception e) {
			
		}
		
		//  3 One try with finaly block
		
		try {
			
		}
		catch(NullPointerException e) {
			
		}finally {
			
		}
		
		//  4  A try block can contain with try and finally only
		
		try {
			
			
		}finally {
			
		}
		
		
		try {
			//Has a return statement which is not throwing any exception.It still executes finally block in this scenario
		}finally {
			
		}
		
		/*There is only one scenario where finally block doesnt 
		execute by writing system.exit(-1); 
		in the try block.Which trys to exit the current JRE*/
	}

}
