package com.src.testtwo;

public class ConstructorWorking {

	int age;
	String name;

	//Default constructor
	ConstructorWorking(){
		this.name="Tester";
		this.age=30;
	}

	//Parameterized constructor
	ConstructorWorking(String n,int a){
		this.name=n;
		this.age=a;
	}
	public static void main(String args[]){
		ConstructorWorking obj1 = new ConstructorWorking();
		ConstructorWorking obj2 = 
				new ConstructorWorking("Ram", 56);
		System.out.println(obj1.name+" "+obj1.age);
		System.out.println(obj2.name+" "+obj2.age);
	}
}