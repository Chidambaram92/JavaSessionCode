package com.newpractise;

public class VerifyVowel {
  public static void main(String[] args) {
    //
      String str = new String("Hi Welcome to Tutorialspoint");
      int counter=0;
      int consonantount=0;
      String strOnne=str.toLowerCase();
      System.out.println(strOnne);
      String strTwo=strOnne.replaceAll("\\s","");
      System.out.println(strTwo);
      for(int i=0;i<strTwo.length();i++){
          if((strTwo.charAt(i)=='a')||(strTwo.charAt(i)=='e')||(strTwo.charAt(i)=='i')||(strTwo.charAt(i)=='o')||(strTwo.charAt(i)=='u')){
              counter++;
          }
          else{
              consonantount++;
          }
      }
      System.out.println("Vowel count is: "+counter);
      System.out.print("Consonants : "+consonantount);
  }
}
