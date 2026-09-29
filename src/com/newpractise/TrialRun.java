package com.newpractise;

public class TrialRun {
  public static void main(String[] args) {

    //call method for try finally block
    //  tryfinallyCheck();
      simpleOutput();
      }
    public static void tryfinallyCheck()
    {
        try{
            System.out.println("Try Block");
            System.exit(0);
        }
        catch(Exception e){
            System.out.println("Catch Block");
        }
        finally{
            System.out.println("Finally Block");
        }
        System.out.println("Outside Block");
    }
    public static void simpleOutput()
    {
        try{
            System.out.print("AA");
           throw new RuntimeException("EE");
        }
        catch(RuntimeException e){
            System.out.println("Catch EE");
        }
        finally{
            System.out.println("Finally Block");
        }
    }
  }
