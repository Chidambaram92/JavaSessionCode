package com.src.testone;

public class ModifiersDefinition {
	/*
	 * 1) Public- Accessible everywhere--> within Class, SubClass, Package 
	 * 2)Protected- Accessible within Class, same Package and also SubClass 
	 * 3)Default-Accessible within Class and same Package 
	 * 4)Private- Accessible within Class only
	 */

	protected int value= 10;
	public int valueOne= 20;
	int valueThree= 30;

	private void stringPrivateMethod() {
		String strOne= "FirstString";
		String subStringOne= strOne.substring(0, 2);
		System.out.println("String is: " +strOne+ " and split String is: "+subStringOne);

	}
	protected void stringProtectedeMethod() {
		String strOne= "ProtectedString";
		System.out.println(" Inside Protected Method: "+strOne);

	}
	void stringDefaultMethod() {
		System.out.println(" Inside Default Method: ");
	}
	public static void main(String[] args) {
		ModifiersDefinition objOne = new ModifiersDefinition();

		objOne.stringPrivateMethod();
		System.out.println(" Pass Able to access Private Method within same class");

		objOne.stringProtectedeMethod();
		System.out.println(" Pass Able to access Protected Method within same class");

		objOne.stringDefaultMethod();
	}

}
