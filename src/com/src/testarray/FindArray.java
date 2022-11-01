package com.src.testarray;

import java.util.Arrays;

public class FindArray {
  public static void main(String[] args) {
    int[]arrayOne= new int[5];
    arrayOne[0]=8;
    arrayOne[1]=5;
    arrayOne[2]=17;
    arrayOne[3]=2;
    arrayOne[4]=80;
    for(int i=0;i<arrayOne.length;i++){
        System.out.println("Array Elements: "+arrayOne[i]);
    }
    Arrays.sort(arrayOne);
      for(int j=0;j<arrayOne.length;j++){
          System.out.println("Array Elements after sort: "+arrayOne[j]);
      }
  }
}
