package com.src.testone;

public class AccessParentOne {
	/*
	 * 1) Public- Accessible everywhere--> within Class, SubClass, Package 
	 * 2)Protected- Accessible within Class, same Package and also SubClass 
	 * 3)Default-Accessible within Class and same Package 
	 * 4) Accessible within Class only
	 */
	public AccessParentOne() {
		System.out.println(" Inside Parent Class Constructor");
	}
	public AccessParentOne(int iVal) {
		System.out.println(" Inside Parent Parametrized  Class Constructor");
	}
	public void testDataString() {
		System.out.println("Inside Parent Class: testDataString Method");

	}
	public void testDataNumber() {
		System.out.println("Inside Parent Class: testDataNumber Method");

	}
	public String parentStringMethod(String name) {
		String valOne= name;
		
		return "Hi " +valOne+ " in Parent String Method";
	}
}

