package com.src.testarray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseString
{
    static String actualString="TestDataVerify";

    static String revString="";

  public static void main(String[] args) {
     String reversedString=reversedString();
     System.out.println("Reversal: "+reversedString);
      reversalStringWithSpace();
      reversalStringWithSpaceCollections();
  }
  public static String reversedString(){
      int lengthValue=actualString.length();
      for(int i=lengthValue-1; i>=0;i--){
          revString=revString+actualString.charAt(i);
      }
      return revString;
  }
  public static void reversalStringWithSpace(){
      System.out.println("Reversal with space: ");
      String inputValue="Test input needed";
      char[]charArray=inputValue.toCharArray();
      int left,right =0;
      right= charArray.length-1;
      for( left=0; left<right;left++,right-- ){
          char temp=charArray[left];
          charArray[left]=charArray[right];
          charArray[right]=temp;
      }
      for(char c:charArray){
          System.out.print(c);
      }

  }
    public static void reversalStringWithSpaceCollections(){
        System.out.println("Reversal with space collections: ");
        String inputValue="Test drive required";
        char[]charArray=inputValue.toCharArray();
       List<Character> characterList= new ArrayList<>();
        for(char c:charArray){
            characterList.add(c);
        }
    Collections.reverse(characterList);
        for (Character character : characterList) System.out.print(character);
    }
}
