package com.src.testarray;

public class ReverseString
{
    static String actualString="TestDataVerify";

    static String revString="";

  public static void main(String[] args) {
     String reversedString=reversedString();
     System.out.println("Reversal: "+reversedString);
  }
  public static String reversedString(){
      int lengthValue=actualString.length();
      for(int i=lengthValue-1; i>=0;i--){
          revString=revString+actualString.charAt(i);
      }
      return revString;
  }
}
