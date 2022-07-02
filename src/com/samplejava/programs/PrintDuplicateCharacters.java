package com.samplejava.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PrintDuplicateCharacters {
    public static void main(String[] args) {

        String finChar= "Tennis";
        findDuplicateCharacter(finChar);

    }
    public static void findDuplicateCharacter(String dupWord)
    {
        char[]charArray= dupWord.toCharArray();
        Map<Character,Integer> charHashMap= new HashMap<Character,Integer>();
        for(char charHas: charArray) {
            Integer count=charHashMap.get(charHas);
            if(count==null) {
                charHashMap.put(charHas, 1);
            }
            else {
                charHashMap.put(charHas, ++count);
            }
        }
        Set<Map.Entry<Character, Integer>> entrySet=charHashMap.entrySet();
        System.out.printf("List of duplicate characters in String '%s' %n", dupWord);
        for(Map.Entry<Character, Integer>stVal:entrySet) {
            if(stVal.getValue()>1) {
                System.out.printf("%s : %d %n", stVal.getKey(), stVal.getValue());
            }
        }
    }
}
