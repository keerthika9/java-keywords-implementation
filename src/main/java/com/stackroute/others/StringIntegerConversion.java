package com.stackroute.others;

public class StringIntegerConversion {
  public int stringConversion() {
    String string = "108";
    int integer = Integer.parseInt(string);
    System.out.println(integer);
    return integer;
  }
  public String integerConversion(){
    int integer=108;
    String result=Integer.toString(integer);
    System.out.println(result);
    return result;
  }

  public static void main(String[] args) {
    StringIntegerConversion stringIntegerConversion=new StringIntegerConversion();
    stringIntegerConversion.integerConversion();
    stringIntegerConversion.stringConversion();
  }
}
