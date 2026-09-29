package com.assignment.fix;

import java.util.Random;

public class RandomNumberGenraot {
  public static void main(String[] args) {
    StringBuilder build = new StringBuilder();
    Random random = new Random();
    String alphanumeric="ABCDEFGHIJKLMNOPQRSTUVWXYZ122345";
    int length=12;
    for(int i=0;i<length;i++)
    {
        int index= random.nextInt(alphanumeric.length());
        char expectedVal=alphanumeric.charAt(index);
        build= build.append(expectedVal);
    }
    System.out.println(build);
  }
}
