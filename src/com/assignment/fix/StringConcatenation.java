package com.assignment.fix;

public class StringConcatenation {

        public static void main(String[] args) {
            String s1 = "Hello";
            String s2 = "World";
            String s3 = s1+s2;
            System.out.println(s3);
            String s4 = "HelloWorld";
           // System.out.println(s1=s2);
            System.out.println(s1.equals(s2));
            System.out.println(s3==s4);
            System.out.println(s3.equals(s4));
            String s5="Tester";
            System.out.println(s5.compareTo(s4));
        }
    }
