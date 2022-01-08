package com.src.testone;

public class VariableTypes {
	// Learn about Local variables, instant variables and static variables
	private static String variableOne="WholeTest";
	private static int arrOne= 12356;
	int instantVariableOne= 9999;
	char instantChar='T';

	public VariableTypes() {

	}

	public static void main(String[] args) {
	
		// Access Static variables
		System.out.println("Static Varaiable One: "+variableOne);
		System.out.println("Static Varaiable Two: " +arrOne);

		// Object Creation
		VariableTypes obj= new VariableTypes();

		// Access non static members 
		int assignInstantVar= obj.instantVariableOne;
		char assignInstantChar= obj.instantChar;
		System.out.println("InstanceVar: "+assignInstantVar);
		System.out.println("InstanceChar: "+assignInstantChar);

		obj.enterValue();
	}

	// non static method cannot access static variables
	public void enterValue() {
		System.out.println(" Non static method");

		// Instantiate Object and access instance variables
		VariableTypes objTwo= new VariableTypes();
		char charValue=objTwo.instantChar;
		int intVar= objTwo.instantVariableOne;

		System.out.println("Instantiate Object and access instance variables: "+charValue+" and  "+intVar);
	}

}
