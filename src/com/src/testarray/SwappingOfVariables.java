package com.src.testarray;

public class SwappingOfVariables {
  public static void main(String[] args) {
      swapInteger();
      swapString();
  }

    public static void swapInteger(){
        int val1=15,val2=20;
        val1=val1+val2;
        val2=val1-val2;
        val1=val1-val2;
        System.out.println("After swapping:"
                + " val1 = " + val1 + ", val2 = " + val2);
    }

    public static void swapString(){
        String sOne="Henry";
        String sTwo="Dravid";
        System.out.println("Strings before swap: sOne = " +
                sOne + " and sTwo = "+sTwo);
        sOne=sOne+sTwo;
        //just print and verify
       // System.out.println(sOne.length()-sTwo.length());
        sTwo=sOne.substring(0,sOne.length()-sTwo.length());
        //just print and verify
     //   System.out.println(sOne.substring(sTwo.length()));
        sOne = sOne.substring(sTwo.length());
        System.out.println("Strings after swap: sOne = " +
                sOne + " and sTwo = "+sTwo);
    }
}
