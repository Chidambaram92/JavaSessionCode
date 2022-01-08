package com.collections.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

// Set is an Interface. Hash set tree set these implements set Interface
public class DemoCollectionsSet {
	public static void hashSetExample() {
		HashSet<String>hasSetObj= new HashSet<String>();

		hasSetObj.add("Group A");
		hasSetObj.add("Group B");
		hasSetObj.add("Group C");
		hasSetObj.add("Group D");
		hasSetObj.add("Group E");
		Iterator<String> itrerate=hasSetObj.iterator();  
		while(itrerate.hasNext()){ 

			System.out.println(itrerate.next()); 

		} 
	}
	public static void hashTreeSetExample() {
		TreeSet<String>hasSeTree= new TreeSet<String>();

		hasSeTree.add("India");
		hasSeTree.add("England");
		hasSeTree.add("Pakistan");
		hasSeTree.add("New Zealand");
		hasSeTree.add("Greece");  
		System.out.println("Tree Set Sorted in ascending order");
		for(String stockVal:hasSeTree) {
			System.out.println(stockVal);
		}
	}
	public static void main(String[] args) {
		hashSetExample();
		hashTreeSetExample();
	}
}
