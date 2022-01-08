package com.src.testtwo;

public class ExampleOverloading 
{
	public void displayTwo(char t)
    {
         System.out.println(t);
    }
    public void displayTwo(char c, int num)  
    {
         System.out.println(c + " "+num);
    }
    public boolean displayTwo(boolean c, int test)  
    {
         System.out.println(c + " "+test);
         return true;
    }
    public String displayTwo(String catVal, int test)  
    {
         System.out.println(catVal + " "+test);
         return "Done String ";
    }
    public static void main(String args[])
    {
    	ExampleOverloading obj = new ExampleOverloading();
    
        obj.displayTwo('a');
        obj.displayTwo('a',10);
       if( obj.displayTwo(true, 15)) {
    	   System.out.println("Yes boolean displayTwo over ridden");
       }
       obj.displayTwo("Test",100);
    }
}
