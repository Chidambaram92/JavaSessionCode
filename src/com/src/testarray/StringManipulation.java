package com.src.testarray;

import java.util.ArrayList;
import java.util.List;

public class StringManipulation {
    private String actualValue="chromeData1234567";
    private String numberAlone=null;
    private String charAlone=null;
  public static void main(String[] args) {
      StringManipulation objOne= new StringManipulation();
      objOne.verifySplitData();
  }
 public void verifySplitData(){
     numberAlone=actualValue.replaceAll("\\D","");
     System.out.println("Number Only: "+numberAlone);
     charAlone=actualValue.replaceAll("\\d","");
     System.out.println("Character Only: "+charAlone);
     String splitValue=charAlone.substring(0,6);
     System.out.println("String First: "+splitValue);
     String splitValueTwo=charAlone.substring(6,10);
     System.out.println("String Second: "+splitValueTwo);
     List<String> arrList= new ArrayList<>();
     arrList.add(splitValue);
     arrList.add(splitValueTwo);
     arrList.add(numberAlone);
     for(String sVal:arrList){
         System.out.println(sVal);
     }
    // \w	Matches the word characters.
    // \W	Matches the nonword characters.
    // \s	Matches the whitespace. Equivalent to [\t\n\r\f].
    // \S	Matches the nonwhitespace.
  }
}
