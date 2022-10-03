package com.src.testarray;

import java.util.Arrays;

public class StringAnagram {
  public static void main(String[] args) {
      StringAnagram objOne= new StringAnagram();
    if(objOne.verifyIfAnagaram()){
        System.out.println("The two strings are anagrams");
    }else{
        System.out.println("The two strings are not anagrams");
    }
  }
  private boolean verifyIfAnagaram(){
      boolean checkValue=false;
      String sOne="Mapprer";
     sOne= sOne.toLowerCase();
      String sTwo="Rampper";
      sTwo=sTwo.toLowerCase();
      if(sOne.length()==sTwo.length()){
        char[]charOne=sOne.toCharArray();
        char[]charTwo=sTwo.toCharArray();
        Arrays.sort(charOne);
          Arrays.sort(charTwo);
      boolean anagramCheck = Arrays.equals(charOne,charTwo);
      if(anagramCheck){
          checkValue=true;
      }
      }
      return checkValue;
  // care ,race

  }
}
