package com.collections.test;

import java.util.Arrays;

public class CodeTest {
  public static void main(String[] args) {
     // multipleCatchBlocks();
      char[] charArray = {'e', 'b', 'c', 'a', 'd'};
      Arrays.sort(charArray);
      for(char c:charArray){
          System.out.println(c);
      }
  //    System.out.println(Arrays.toString(charArray));
  }
    public static void multipleCatchBlocks() {
        try{
            String rentVal= null;

            System.out.println("Get String Length: "+rentVal.length());
        }

        catch (NullPointerException e) {
            System.out.println("Null pointer Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch(Exception e){
            System.out.println("Main Exception caught");
        }
    }
}
