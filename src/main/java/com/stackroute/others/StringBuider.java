package com.stackroute.others;

public class StringBuider {
    public String stringBuilderReplacement(String name,String output){
      StringBuilder stringBuilder=new StringBuilder();
      String result=name.replaceAll(name,output);
      return result;
    }
  }

