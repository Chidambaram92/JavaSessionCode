package com.newpractise;

import java.util.HashMap;

public class CountPractise {
public static void main(String[] args){
    String strValue="AABCDEHCJHJEJITF";
    char[]chArray=strValue.toCharArray();
    HashMap<Character,Integer> hMap= new HashMap<>();
    for(char ch: chArray)
    {
        if(hMap.containsKey(ch)){
            hMap.put(ch,hMap.get(ch)+1);
        }
        else{
            hMap.put(ch,1);
        }
    }
    for(char c:hMap.keySet()){
        System.out.print(c+" ");
        System.out.println(hMap.get(c));
    }
}

}
