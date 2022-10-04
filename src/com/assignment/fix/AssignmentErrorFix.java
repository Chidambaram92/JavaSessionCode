package com.assignment.fix;

import java.util.HashMap;
import java.util.Set;

public class AssignmentErrorFix {
  public static void main(String[] args) {
    HashMap<Integer,String> hMap= new HashMap<>();
      hMap.put(8,"java");
      hMap.put(5,"matlab");
      hMap.put(10,"python");
      hMap.put(6,"c#");
      Set<Integer> keyTrace= hMap.keySet();
      System.out.println("HashMap content as follows: ");
      for(int sVal:keyTrace){
          System.out.println("Key: "+sVal+ " value: "+hMap.get(sVal));

      }
    System.out.println("Value at index or Key 5 " +hMap.get(5));
      String actualString="Coimbatore";
      for(int i=0;i<actualString.length();i++){
        char c= actualString.charAt(i);
        System.out.println(c);
      }
  }
}
