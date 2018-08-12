package com.ExceptionHanling.ExampleProgram1;

public class Machine {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		
		Machine M = new Machine();
		
		int c = M.div(50,0);
		System.out.println(c);
		

	}
	
	
	public int div(int a , int b) {
		
		int c = -1;
		try {
		c= a/b;
	}catch(Exception e){
		System.out.println("The catch block");
		   
	}
		return c;
	}

}
