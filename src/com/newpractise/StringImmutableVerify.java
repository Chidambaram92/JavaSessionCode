package com.newpractise;

public class StringImmutableVerify {
  public static void main(String[] args) {
    // Check if string value is replacable
    String sValue = "Chrome";
    sValue = "Browser";
    System.out.println(sValue); // Expected o/p: Browser
    // Using string builder
    StringBuilder sBuilder = new StringBuilder("Area");
    sBuilder.append("New");
    System.out.println(sBuilder); // Expected o/p: AreaNew
     // cannot change string value unless assigned to a new project
    String s1 = "java";
    s1.concat(" rules");
    System.out.println(s1); // Expected o/p: java  [here s1 is immutable]
   // create some object for string and study
    String testOne = new String("Hostel");
    testOne.concat("Duty");
    System.out.println(testOne); // Expected o/p: Hostel  [here s1 is immutable]
    testOne=testOne.concat("Duty");
    System.out.println(testOne);
  }
}
