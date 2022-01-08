package com.src.testtwo;

public class ClassEncapsulationTest {
	public static void main(String[] args) {  
	    //creating instance of Account class  
	    ClassEncapsulationDetails objOne=new ClassEncapsulationDetails();  
	    //setting values through setter methods  
	  
	    objOne.setFirstName("Raja");  
	    objOne.setLastName("Ram");  
	    objOne.setMarkValue(75);  
	    objOne.setFlagValue(true);
	    //getting values through getter methods  
	    System.out.println(objOne.getFirstName()+" "+objOne.getLastName()+" "+objOne.getMarkValue()+" "+objOne.getFlagValue());  
	}  
}
