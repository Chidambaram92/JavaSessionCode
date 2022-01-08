package com.src.testtwo;

public class ConditionsCheck {
	public static void main(String[] args) {
	
		loopBreak();
		if (statmentClear(20)) {
			System.out.println("True with boolean check");
		}
		else {
			System.out.println("False with boolean check");
		}
	}
  
	private static void loopBreak() {
		for (int i = 0; i < 10; i++)
		{
			if (i == 5)
				break;

			System.out.println("i: " + i);
		}
		System.out.println("Loop complete.");
	}
	
	private static boolean statmentClear(int argValue) {
		boolean flag= false;
		int i= argValue;
  
        if( (i >= 20) && (i<=25)) {
        }
        else if (i != 15) {
        }
            
        else if (i == 15) {
        	flag = true;
        }
            
        else
            System.out.println("Value of i: "+i);
		return flag;
	}
}


