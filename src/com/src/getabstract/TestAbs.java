package com.src.getabstract;

public class TestAbs extends ReExecuteAbs {

	@Override
	void runnerTest() {
	System.out.println(" Abstract Runner Test Method called");
		
	}
public static void main(String[] args) {
	ReExecuteAbs absObj= new TestAbs();
	absObj.runnerTest();
	absObj.checkWork();
}
}
