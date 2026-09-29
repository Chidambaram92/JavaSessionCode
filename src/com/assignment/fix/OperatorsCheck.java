package com.assignment.fix;

public class OperatorsCheck
{
  public static void main(String[] args) {
    int a=5,b=10;
    int c= a++;
    int d=c;
    System.out.println(c);
    System.out.println(d);
    System.out.println(a);
    int v= 5,g=10;
    int x= v++*-g+v++*g;
      System.out.println(x);
  }
}
