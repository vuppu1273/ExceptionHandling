package com.ExceptionHanling.ExampleProgram1;

public class EmployeeDemo {
	
	public static void main(String[] args) throws NameNotFoundExcep {
		
		Employee Emp1 = new Employee(1 , "Saikanth");
		Employee Emp2 = new Employee(2 , "ravi"); 	
		
		Employee Emp3 = new Employee(3, null);
		if(Emp3.getId() < 1) {
			System.out.println("Invalid Id");
		}if(Emp3.getName() == null) {
			throw new NameNotFoundExcep("this");
		}
	}

}
