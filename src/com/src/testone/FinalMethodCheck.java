package com.src.testone;

public class FinalMethodCheck{

    public static void main(String[] args) {
        final double PI = 3.14159;
        System.out.println("Value of PI: " + PI);
      //  PI=5.258; --->compile time error 'cannot assign value to a final variable PI'
    }
}
