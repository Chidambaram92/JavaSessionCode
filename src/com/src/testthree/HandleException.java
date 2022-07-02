package com.src.testthree;

public class HandleException {

	public void arrayIndexOutOfBoundsHandling() {
		try {
			int[] arrayOne = new int [5];
			// Exception Occurs Here
			arrayOne[6]= 15;
			System.out.println("Try");
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	public void nullPointerHandling() {
		try {
			String valueOne=null;	
			// Exception Occurs here
			if(valueOne.contains("test")) {
				System.out.println("Pass");
			}
			//System.out.println(+valueOne.length());
		}catch(NullPointerException e) {
			e.printStackTrace();
			System.out.println("Null Pointer Exception caught");
		}
	}
	public void arithmeticHandling() {
		try {

			// Exception Occurs here
			int addValue=15;  
			int	resultValue=  addValue/0;   
			System.out.println(resultValue);  
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Arithmetic Exception caught");
		}
	}

	public static void main(String[] args) {
		HandleException ObjOne= new HandleException();
		//ObjOne.arrayIndexOutOfBoundsHandling();
		//ObjOne.nullPointerHandling();
		ObjOne.arithmeticHandling();
	}

}
