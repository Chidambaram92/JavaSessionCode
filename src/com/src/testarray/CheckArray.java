package com.src.testarray;

public class CheckArray {
	public static void main(String[] args){
		int[] arr ={2,11,45,9};
		
		//i starts with 0 as array index starts with 0
		int i=0;
		System.out.println("First set of array: ");
		while(i<4){
			System.out.println(arr[i]);
			i++;
		} 
		int[] arrayTwo = {5,7,9,11,15,17,19,25};
		callIntArray(arrayTwo);
		checkStringArray();
	}

	public static void callIntArray(int[] arr) {
		System.out.println("Array Two:");
		for (int j : arr) {

			System.out.println(j);
		}
	}
	public static void checkStringArray() {
		String[] stringArray = {"Hey","Test", "Rift", "Cricket", "Fb"};

		System.out.println("String Array elements displayed using enhanced for loop:");
		
		for(String val:stringArray)
			System.out.print(val + " ");
	}
}
