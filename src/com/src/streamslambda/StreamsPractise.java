package com.src.streamslambda;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsPractise {
  public static void main(String[] args) {
      StreamsPractise dupObj= new StreamsPractise();
      dupObj.printDuplicateWithStream();
      dupObj.maxAndMinNumber();
  }
  private void printDuplicateWithStream(){
      //Integer Duplicate
      List<Integer> listValue= Arrays.asList(1,3,5,20,33,19,3,19);
     Set<Integer> duplicate= listValue.stream().filter(e -> Collections.frequency(listValue,e)>1).collect(Collectors.toSet());
     System.out.println("Duplicate Integer values are: "+duplicate);
      //String Duplicate
     List<String>stringValue=Arrays.asList("Test" ,"Batter" ,"ODI", "Batter");
     Set<String>duplicateString= stringValue.stream().filter(s -> Collections.frequency(stringValue,s)>1).collect(Collectors.toSet());
      System.out.println("Duplicate String values are: "+duplicateString);
  }
  private void maxAndMinNumber(){
      List<Integer>listValueOne=Arrays.asList(1,3,5,20,33,19,3,19);
     int maxValue= listValueOne.stream().max(Comparator.comparing(Integer::valueOf)).get();
     System.out.println("Maximum value is: "+maxValue);
     int minValue=listValueOne.stream().min(Comparator.comparing(Integer::valueOf)).get();
      System.out.println("Minimum value is: "+minValue);

//      List<Integer> sortedList = unsorted.stream().map(Integer::parseInt).sorted().collect(Collectors.toList());
//      sortedList.forEach(System.out::println);
//      Integer max = Collections.max(sortedList);
//      System.out.println("Maximum price from the product list is: "+max);
  }
}
