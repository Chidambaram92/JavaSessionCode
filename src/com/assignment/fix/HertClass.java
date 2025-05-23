package com.assignment.fix;

public class HertClass {
  public static void main(String[] args) {
    String sValue = "ABCdefGHkjil";
    int uppercase=0;
    int lowercase=0;
    char[] chArray = sValue.toCharArray();
    for(char ch:chArray){
        if(ch>='A'&& ch<='Z'){
            uppercase++;
            System.out.println(ch+" -->CAPS");
        }
        if(ch>='a'&& ch<='z'){
            lowercase++;
            System.out.println(ch+" -->SMALL");
        }
    }
    System.out.println("Uppercase count is: "+uppercase);
      System.out.println("Lowercase count is: "+lowercase);
  }
}