package com.newpractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringSplit {
  public static void main(String[] args) {
    String sValue="Test\nData\nValue";
    System.out.println(sValue);
    String[]strrray=sValue.split("\n");
    List<String> listOne= Arrays.asList(strrray);
    System.out.println(listOne);
      String sValued="Test\nData\nValue\nautomate";
      List<String> listTwo= new ArrayList<>();
      String[]strrraytwo=sValue.split("\n");
      String oneValue=strrraytwo[1];
      System.out.println(oneValue);
  }
}
