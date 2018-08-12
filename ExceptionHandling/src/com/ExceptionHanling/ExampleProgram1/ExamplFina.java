package com.ExceptionHanling.ExampleProgram1;

public class ExamplFina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S = null;
		
		try {
			 S.toString();
			System.out.println("1");
			 
		}catch(Exception E) {
			System.out.println("Nullpointer Exception");
		}finally {
			System.out.println("Finally Block");
		}

	}

}
