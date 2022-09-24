package com.src.testthree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ThrowThrowsHandling {
  public static void main(String[] args) {
    ThrowThrowsHandling objVal= new ThrowThrowsHandling();
    //throw
    try{
      objVal.testThrow(35);
    }catch(ArithmeticException e){
      e.printStackTrace();
    }
    objVal.testThrow(75);
    // throws
    try {
      testThrows();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }


    private void testThrow(int acceptedValue){
      if(acceptedValue<80 && acceptedValue>40){
          throw new RuntimeException("The value is less than major grade eligible criteria");
      }
      else if (acceptedValue<40){
          throw new ArithmeticException("This input is much lesser for any grade");
      }
      else{
        System.out.println("The value is equivalent to the major grade eligible criteria");
        }

    }
    private static void testThrows() throws IOException{
      BufferedWriter objectBuffer = new BufferedWriter(new FileWriter("testFile.txt"));
      objectBuffer.write("TestData");
      objectBuffer.close();
    }
}
