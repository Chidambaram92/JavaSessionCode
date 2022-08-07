package com.src.testthree;

import com.src.testone.AccessBaseOne;

public class AccessChildTwo extends AccessBaseOne
{
	public AccessChildTwo() {
		super(5);

	}
	 public void testBlank() {
		 System.out.println("Inside Child Test Blank");
	 }
	 public String testDataString() {
		 String valueOne= "Child IT Department";
		 return valueOne;
	 }

	public static void main(String[] args) {
		
		// Overridden
		
		AccessBaseOne objectFour = new AccessChildTwo();
		objectFour.testBlank();
		System.out.println(objectFour.testDataString());
		
		AccessChildTwo objChildTwo = new AccessChildTwo();
		objChildTwo.testBlank();
		System.out.println(objChildTwo.testDataString());
		
		AccessBaseOne objChildThree = new AccessBaseOne(10);
		objChildThree.testBlank();
		System.out.println(objChildThree.testDataString());
		
//		AccessChildTwo objectFive = new AccessBaseOne();
//		objectFour.testBlank();
//		System.out.println(objectFour.testDataString());
//
	}
}
