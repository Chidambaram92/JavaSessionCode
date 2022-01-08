package com.src.testthree;

public class HandleMultipleTryCatch {
	public static void main(String[] args) {  

		try{    
			int arrayOne[] = new int [5];
			arrayOne[6]= 17;  
			System.out.println(arrayOne[6]);  
		}    
		catch(ArithmeticException e)  
		{  
			System.out.println("Arithmetic Exception occurs");  
		}    
		catch(ArrayIndexOutOfBoundsException e)  
		{  
		
			System.out.println("ArrayIndexOutOfBounds Exception occurs");  
		}    
		catch(Exception e)  
		{  
			System.out.println("Parent Exception occurs");  
		}             
		finally {
			System.out.println("Finally Executed");
		}
		// Call another method
		multipleCatchBlocks();
	}  

	public static void multipleCatchBlocks() {
		try{    
		String rentVal= null;
		
		System.out.println("Get String Length: "+rentVal.length());
		}    

		catch (NullPointerException e) {
			System.out.println("Null pointer Exception occurs");
		}   
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		}   
		catch(Exception e){
			System.out.println("Main Exception caught");
		}  
	}
}
