package com.samplejava.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PrintDuplicateString
{
    public static void main(String[] args) {

        String finWord= "Java learning in progress and process is in progress";
        findDuplicateWord(finWord);

    }
    public static void findDuplicateWord(String sValueOne) {
        String[]strValue=sValueOne.split(" ");
        Map<String,Integer> hMap= new HashMap<String,Integer>();
        for(String strOne:strValue)
        {
            if(hMap.containsKey(strOne))
            {
                hMap.put(strOne, hMap.get(strOne)+1);
            }
            else {
                hMap.put(strOne, 1);
            }
        }
        Set<Map.Entry<String,Integer>> entrySet=hMap.entrySet();
        System.out.printf("List of duplicate words in String '%s' %n", sValueOne);
        for(Map.Entry<String, Integer>stVal:entrySet) {
            if(stVal.getValue()>1) {
                System.out.printf("%s : %d %n", stVal.getKey(), stVal.getValue());
            }
        }
    }
}
