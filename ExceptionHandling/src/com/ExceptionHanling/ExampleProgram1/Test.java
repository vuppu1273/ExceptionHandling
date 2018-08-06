package com.ExceptionHanling.ExampleProgram1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 50, b = 10;
		int[] arr =  new int[3];
		String s = null;
		
		try {
			
			int c = a/b;
			s.toString();
			arr[5] = 10;
			System.out.println("1");
			System.out.println("2");
			System.out.println("The addittion of a and b is :"+c);
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("in an ArrayIndexOutOfException block");
			e.printStackTrace();
			
		}catch(ArithmeticException e) {
			System.out.println("In Artha Exception Block");
			e.printStackTrace();
			
		}catch(NumberFormatException e) {
			System.out.println("In Format Exception");
			e.printStackTrace();
			
		}
		System.out.println("End of main methd");
	}

}
