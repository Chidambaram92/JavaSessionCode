package com.collections.test;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class DemoCollectionsMap {
	private static void exampleHashMap() {
		HashMap<Integer, String>hMap= new HashMap<Integer,String >();
		hMap.put(5,"Ajith");
		hMap.put(10,"Dev");
		hMap.put(38,"Shaw");
		hMap.put(24,"Joe");
		Set<Integer>arrSet= hMap.keySet();
		
		 for(int arrSetsElement:arrSet) {
			 System.out.println("After fetch value of Key " +arrSetsElement+" is:" +hMap.get(arrSetsElement) );
	
		 }
		hMap.get(24);
		 exampleTreeMap(hMap);
	}
	private static void exampleTreeMap(HashMap <Integer, String> passMap) {
		System.out.println("Tree Map method");
		TreeMap<Integer, String>hMap= new TreeMap<Integer,String >();
		hMap.put(5,"Ajith");
		hMap.put(38,"Joe");
		hMap.put(10,"Dev");
		hMap.put(24,"Key");
		hMap.put(35,"Joe");
		
				Set<Integer>arrSet= hMap.keySet();
		 for(int arrSetsElement:arrSet) {
			 System.out.println("After fetch value of Key " +arrSetsElement+" is:" +hMap.get(arrSetsElement) );
		 }
	}
	public static void main(String[] args) {
		exampleHashMap();
	}

}
