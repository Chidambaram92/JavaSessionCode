package com.src.testtwo;

public class LoopsExample {
	public static void main(String[] args) {
		System.out.println("Inside Main Method");
		switchMethod(3);		

	}
// case statement
	private static void switchMethod(int caseValue) {
		switch(caseValue) {

		case 1:
			forLoopCheck();
			break;

		case 2:
			whileLoopCheck();
			break;

		case 3:
			doWhileLoopCheck();
			break;
		default:
			System.out.println("Invalid Break");
			break;

		}

	}
	private static void forLoopCheck() {
		for(int i=0; i<5;i++) {

			for(int j=0; j<=i; j++) {
				System.out.println("Value of i: " +i+ " Value of j: "+j);
			}

		}
		// Enhanced for loop example 
		String strArray[]= {"Aswin","Ben","Cap","Test"};
		for(String val: strArray) {
			System.out.println("String Array: "+val);
		}

	}
	private static void whileLoopCheck() {
		int i = 1;	  
		while (i <= 5)
		{
			System.out.println("Value of i:" + i);

			i++;
		}

	}
	private static void doWhileLoopCheck() {
		int i = 5;
        do
        {
       // change in increment
            System.out.println("Value of x:" + i);
           i+= 2;
        }
        while (i < 15);

	}
	
}
