package com.src.testthree;

import com.src.testone.AccessParentOne;

public class AccessChildOne extends AccessParentOne {
	
		public void subTestDataString() {
			System.out.println("Inside Sub Class: SubtestDataString Method");

		}
		public void subTestDataNumber() {
			System.out.println("Inside Sub Class: SubtestDataNumber Method");

		}
	

	public static void main(String[] args) {
		// Access Parent class methods using Parent Class object
		AccessParentOne objMain = new AccessParentOne();
		objMain.testDataNumber();
		
		// Access Child class methods using Sub Class object
		AccessChildOne objSubClass = new AccessChildOne();
		objSubClass.subTestDataString();
		objSubClass.subTestDataNumber();
		
		// Access Parent class methods using Sub Class object
		objSubClass.testDataNumber();
		objSubClass.testDataString();
		
		// Error cannot access Sub Class or Child class methods using Parent Class Object
		//objMain.subTestDataString();
		
		// Passing Arguments and try
		String test=objSubClass.parentStringMethod("Rakesh");
		System.out.println("Got response: "+test);
	}
}

