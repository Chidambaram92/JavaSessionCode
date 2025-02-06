package com.assignment.fix;

public class ReverseNumber {
  public static void main(String[] args) {
    //
    int number = 1315;
    int i, j = 0;
    while (number > 0) {
      i = number % 10;
      j = (j * 10) + i;
      number=number/10;
    }
      System.out.println("The reverse number is "+j);
  }
}
