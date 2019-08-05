package com.stackroute.others;

public class StringBuider {
  public static void main(String[] args) {
    StringBuilder sb=new StringBuilder("Hello ");
    sb.insert(0,"Java");//now original string is changed
    System.out.println(sb);//prints javahello
    sb.replace(1,3,"Java");
    System.out.println(sb);
    sb.reverse();
    System.out.println(sb);
  }

}

