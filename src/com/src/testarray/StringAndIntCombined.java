package com.src.testarray;

public class StringAndIntCombined {
  public static void main(String[] args) {
    // String declaration
      String strOne="stadium";
      char[]charArray=strOne.toCharArray();
      for(int i=2;i<charArray.length;i+=3){
         char extractValue=charArray[i];
          System.out.println("Extracted value: "+extractValue);
         charArray[i]= Character.toUpperCase(charArray[i]);
System.out.println("After conversion: " +new String(charArray));
          palindromeTest(strOne);
          palindromeTest("teet");
      }

  }
    private static void palindromeTest(String strValue){
      String reverseValue="";
     for(int i=strValue.length()-1;i>=0;i--){
         reverseValue=reverseValue.concat(String.valueOf(strValue.charAt(i)));
       //  reverseValue=reverseValue+strValue.charAt(i);
     }
        System.out.println("Reverse Value for String: " +strValue+ " is - " +reverseValue);
        if(reverseValue.equalsIgnoreCase(strValue)){
            System.out.println("Palindrome check is True for string: "+strValue);
        }
        else{
            System.out.println("Palindrome check  is False for string: "+strValue);
        }
    }

}
