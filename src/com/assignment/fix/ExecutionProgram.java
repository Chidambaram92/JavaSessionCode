package com.assignment.fix;



import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;


public class ExecutionProgram {
    public static void main(String[] args) {
       // String sValue = "sentence4 is2 the3 this1";
        String sValue = "sentence3 is2 the4 this1";
        String[]arrayOne= sValue.split(" ");

        Arrays.sort(arrayOne);
        for(String s:arrayOne) {
            // System.out.println(s);
        }
        int n=arrayOne.length-1;
        HashMap<Integer,String>hMap= new HashMap<>();
        for(int i=0;i<=n;i++) {
            int key= Integer.parseInt((arrayOne)[i].replaceAll("\\D", ""));
            String value=arrayOne[i].replaceAll("\\d", "");
            hMap.put(key, value);
        }
        System.out.println(hMap)	;
        Set<Integer>setValue=hMap.keySet();
        for(int i:setValue)   {
            System.out.println(hMap.get(i));
        }
    }


}

