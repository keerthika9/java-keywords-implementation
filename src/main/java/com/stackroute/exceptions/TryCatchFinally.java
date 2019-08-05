package com.stackroute.exceptions;

public class TryCatchFinally {
  public static String trial(){
    try{
      System.out.println("executing try block");
      return "returning from try block";
    }catch(Exception e){
      return "returning from catch blcok";
    }finally{
      System.out.println("statement from finally");
    }
  }
}


