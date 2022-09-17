package com.src.testone;

public class DataTypes {

	public static void main(String[] args) {

		System.out.println("In Main Method");
		
		// Creation of Object for calling methods inside Same Class
		DataTypes dataTypesObj = new DataTypes();
	
		
		// Using Object for calling methods which are 'private' specific 

		dataTypesObj.primitiveDataTypes();
		dataTypesObj.nonPrimitiveDataTypes();
		
	}

	
	//commonly use primitive data types
	private void primitiveDataTypes() {
		int testValue= 15;
		boolean flagValue= true;
		
		// long is 8 byte and defaulted to 0
		long longValue = 84;
		
		// float is 4 byte , 7 decimals
		float floatValue=15.789f;
		
		// double is 8 byte , upto 16 decimals
		double doubValue=589.6321;
		
		// char in single quotes
		char charValue= 'w';
		
		// Type Casting
		int typeCastValue = (int)floatValue;
		
		System.out.println("Int data value is: "+testValue);
		System.out.println("Boolean data value is: "+flagValue);
		System.out.println("Float data value is: "+floatValue);
		System.out.println("Double data value is: "+doubValue);
		System.out.println("Character data value is: "+charValue);
		System.out.println("Long data value is: "+longValue);
		System.out.println("Type cast data value is: "+typeCastValue);


	}
	//commonly use primitive data types
	private void nonPrimitiveDataTypes() {
		
		String strOne= "FirstString";
		String subStringOne= strOne.substring(0, 2);
		System.out.println("String is: " +strOne+ " and split String is: "+subStringOne);
		String strTwo="TestData";
		String subTwo=strTwo.substring(3);
		System.out.println("String is: " +strTwo+ " and split String is: "+subTwo);
		// String Split example
		 String actualText="Test:Admin:Work";
				 String[] splitText =actualText.split(":",3);
				 for(int i=0; i<splitText.length; i++) {
					 System.out.println(splitText[i]);
				 }
	
	}

}
