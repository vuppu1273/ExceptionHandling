package com.ExceptionHanling.ExampleProgram1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class InputFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream FS = new FileInputStream("C:sbc//bbc/fvf.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
