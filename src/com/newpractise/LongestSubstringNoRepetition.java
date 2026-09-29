package com.newpractise;

import java.util.HashSet;

public class LongestSubstringNoRepetition {
  public static void main(String[] args) {
    String expectedValue=voidGetLongestSubstring("abcdeab");
    System.out.println(expectedValue);
  }
  public static String voidGetLongestSubstring(String sValue){
        HashSet<Character> hSet= new HashSet<>();
        String longestOverall="";
        String longestTillnow="";
        for(int i=0;i<sValue.length();i++){
            char c =sValue.charAt(i);
            if(hSet.contains(c)){
                longestTillnow="";
                hSet.clear();
            }
            hSet.add(c);
            longestTillnow= longestTillnow+c;
            if(longestTillnow.length()>longestOverall.length())
            {
                longestOverall=longestTillnow;
            }
        }
     return longestOverall;
    }
}
