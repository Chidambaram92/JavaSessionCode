package com.src.testone;

public class ModifiersPackageDefinition {
	
	public static void main(String[] args) {
		ModifiersDefinition objTwo= new ModifiersDefinition();

		System.out.println(objTwo.valueOne);
		System.out.println(objTwo.value);
		System.out.println(objTwo.valueThree);
		System.out.println(" Able to access variables in class of Same package");
		objTwo.stringDefaultMethod();
		objTwo.stringProtectedeMethod();
		
	}

}
