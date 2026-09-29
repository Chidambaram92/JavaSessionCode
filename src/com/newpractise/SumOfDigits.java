package com.newpractise;

public class SumOfDigits {

    public static void main(String[] args){
        int expectedValue=6548713;
        int sum=0;
        while(expectedValue>0){
            int i=expectedValue%10;
            sum=sum+i;
            expectedValue=expectedValue/10;
        }
        System.out.println("Sum of value: "+sum);
        verifySummation();

    }
    public  static void verifySummation(){
        String sValue="1@#245$36%";
        int sum=0;
        String extractValue=sValue.replaceAll("\\D","");
        String expectedValue=extractValue;
        System.out.println("only numbers: "+expectedValue);
        for(int i=0;i<sValue.length();i++){
            char c= sValue.charAt(i);
            if(Character.isDigit(c)){
                int b=Integer.parseInt(String.valueOf(c));
                sum=sum+b;
            }
        }
        System.out.println("Sum of all digits: "+sum);
    }
}
