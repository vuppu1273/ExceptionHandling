package com.ExceptionHanling.ExampleProgram1;

public class Dummy {
	
	public static void main(String[] args) {
		
		String s = "abc";
		String s1 = null;
		
		int[] arr = new int[3];
		
		
		try {
			
			System.out.println("1");
			s.toString();
			
			try {
				
				System.out.println("2");
				s1.toString();
				
			}	catch(ArithmeticException e) {
				
				System.out.println("Inner Exception Block");
		} 
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Outer Exception Block");
			
		}
		
		
		//System.out.println("Main Block");
		
	}
}