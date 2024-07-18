package com.samplejava.programs;

import java.util.ArrayList;

public class VowelValidation {
  public static void main(String args[]) {
    String vowelValue = "aeiou";
    int count = 0;
    ArrayList<Character> arrList = new ArrayList<Character>();
    String searchString = "TestDataVal";
    String actual = searchString.toLowerCase();
   // char[]charArray=actual.toCharArray();
    System.out.println("Actual Vowel String: " + actual);
    for (int i = 0; i < vowelValue.length(); i++) {
      arrList.add(vowelValue.charAt(i));
    }
    for(int i=0;i<actual.length();i++){
        if(arrList.contains(actual.charAt(i))){
            count++;
        }
    }
      System.out.println("After adding arrayList " + arrList);
      System.out.println("Total no of vowels in string are: " + count);
  }
}
