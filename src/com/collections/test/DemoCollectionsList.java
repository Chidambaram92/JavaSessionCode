package com.collections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

// Array List-->implements-->List (Interface)-->extends-->Collection

public class DemoCollectionsList {
	public static void main(String[] args) {
		DemoCollectionsList demoObj= new DemoCollectionsList();
		//demoObj.arrayListMethod();
		demoObj.arrayLinkListMethod();
	}
	public void arrayListMethod() {
		ArrayList<String>arrList = new ArrayList<String>();
		arrList.add("Test");
		arrList.add("Jam");
		arrList.add("Fvec");
		arrList.add("MJ");
		arrList.add("Lebron");
		arrList.add("James");
		System.out.println("Array list before adding: "+arrList);
		arrList.set(2, "Volt");
		arrList.set(4, "Ray");
		System.out.println("Array list after editing: ");
		for(int i=0;i<arrList.size();i++) {
			System.out.println(arrList.get(i)+ " ");
		}
		arrList.remove(5);
		System.out.println("Thorugh Iterator after Method: ");
		Iterator<String> itrerate=arrList.iterator();  
		while(itrerate.hasNext()){ 
			
			System.out.println(itrerate.next()); 
		} 


	}
	public void arrayLinkListMethod() {
		LinkedList<Integer>arrLinkList = new LinkedList<Integer>();
		arrLinkList.add(5);
		arrLinkList.add(10);
		arrLinkList.add(15);
		arrLinkList.add(20);
		arrLinkList.add(25);
		arrLinkList.add(30);
		System.out.println(" Integer Array list before adding: "+arrLinkList);
		arrLinkList.set(4,50 );
		arrLinkList.set(5, 60);
		System.out.println("Integer Array list after editing: ");
		for(int i=0;i<arrLinkList.size();i++) {
			System.out.println(arrLinkList.get(i)+ " ");
		}
		Collections.addAll(arrLinkList, 110,120);
		System.out.println("Add all conecpt");
		System.out.println(arrLinkList);
	}
	private void testArrayList() {
	
	}
}
