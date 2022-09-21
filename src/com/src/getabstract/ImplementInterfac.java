package com.src.getabstract;

public class ImplementInterfac implements StandardInterfac,TestInter {
	int empStrength;
	String comName;

	public void companyName(String validName) {
	System.out.println("Implemented Comp Name");
		comName= validName;
		System.out.println(comName);
		
	}

	
	public void numOfEmployee(int validNumber) {
		System.out.println("Implemented Emp Strength");
		empStrength= validNumber;
		System.out.println(empStrength);

	}
	public void printValues() {
		System.out.println("Comp Name is: "+comName);
		System.out.println("Comp Strength is: "+empStrength);
		
	}
 public static void main(String[] args) {
	 StandardInterfac obj = new ImplementInterfac();
	 obj.companyName("Infosys");
	 obj.numOfEmployee(5000);
	 System.out.println(obj.nameVal);
	// obj.printValues();
	 TestInter objTwo= new ImplementInterfac();
	 objTwo.TestName("CGI");
}

	@Override
	public void TestName(String validName) {
		System.out.println("Implemented Test Name");
		System.out.println(validName);
	}
}
