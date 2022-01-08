package com.src.testthree;

import com.src.testone.ModifiersDefinition;

public class ModifiersExtendedDefinition extends ModifiersDefinition  {
	
	public static void main(String[] args) {
		
		ModifiersExtendedDefinition objThree= new ModifiersExtendedDefinition();

		System.out.println(objThree.valueOne);
		System.out.println(objThree.value);
		
		//System.out.println(objThree.valueThree);
		
		objThree.stringProtectedeMethod();
		
		
		//objThree.stringDefaultMethod();
	}

}
