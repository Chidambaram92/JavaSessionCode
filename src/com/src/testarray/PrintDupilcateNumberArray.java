package com.src.testarray;

import java.util.*;

public class PrintDupilcateNumberArray {
    public static void main(String[] args){
        int[]arrayOne= {17,88,2,1,22,88,5,2};
        Arrays.sort(arrayOne);
        findDuplicateArray(arrayOne);
        sortIntArray();
    }
 public static void findDuplicateArray(int[]arrayValue)
 {
     System.out.println("Before finding duplicate but the array is sorted: ");
  for(int iVal:arrayValue){

      System.out.println(iVal);
  }
  Map<Integer,Integer> hashMap= new HashMap<>();
  for(int eachElement:arrayValue){
      if(hashMap.containsKey(eachElement)){
          hashMap.put(eachElement,hashMap.get(eachElement)+1);
      }
      else{
          hashMap.put(eachElement,1);
      }
  }
  Set<Map.Entry<Integer, Integer>> setRange= hashMap.entrySet();
  for(Map.Entry<Integer,Integer>intValue:setRange){
      if(intValue.getValue()>1){
          System.out.println("Duplicate Entries in array: "+intValue.getKey());
      }
  }

 }
    public static void sortIntArray(){
        int[]arrayOne={75,25,33,85,7,44,10};
        int temp=0;
        for(int i=0;i<arrayOne.length;i++){
            for(int j=i+1;j<arrayOne.length;j++){
                if(arrayOne[i]>arrayOne[j])
                {
                    temp=arrayOne[i];
                    arrayOne[i]=arrayOne[j];
                    arrayOne[j]=temp;
                }
            }
        }
       // Arrays.sort(arrayOne);
        System.out.println("After Sorting Integer array as below: ");
        for(int k=0; k<arrayOne.length;k++){
            System.out.print(arrayOne[k]+" ");
    }

    }
 }

