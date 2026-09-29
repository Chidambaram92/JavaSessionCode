package com.newpractise;

import java.util.*;

public class RemoveDuplicate {
    public static void main (String[] args) {
        List<String> arlist= new ArrayList<>();
        arlist.add("Test");
        arlist.add("Data");
        arlist.add("Verify");
        arlist.add("Test");
        arlist.add("Deliver");
        arlist.add("Data");
        System.out.println("Before list: "+arlist);
        Set<String> setval= new HashSet<>(arlist);
        List<String> arlistOne= new ArrayList<>(setval);
        System.out.println("After list: "+arlistOne);
        RemoveDuplicate objOne= new RemoveDuplicate() ;
        objOne.callHashing();
    }
    private void callHashing(){
        String sValue = "sentence3 is2 the4 this1";
        String[]arrOne=sValue.split(" ");
        TreeMap<Integer,String>mapping= new TreeMap<>();
        int arrLength=arrOne.length-1;
        for(int i=0;i<=arrLength;i++){
            int key= Integer.parseInt((arrOne)[i].replaceAll("\\D", ""));
            String value= arrOne[i].replaceAll("\\d"," ");
            mapping.put(key,value);
        }
        for(int i: mapping.keySet()){
            System.out.println("Required output: "+mapping.get(i));
        }
    }
}
