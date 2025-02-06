package com.src.streamslambda;

public class TestData {
  public static void main(String[] args) {
    String value = "Performance";
    value=value+"test";
    char extractedValue = 0;
    char[] charArray = value.toCharArray();
    String sValue = value.replace("r", "f");
    System.out.println("Interchanged value: " + sValue);
  }
}
