package com.stackroute;
import java.util.*;
public class ConditionalStatements {
  public static void main(String args[]){
    Scanner scanner=new Scanner(System.in);
    int year=scanner.nextInt();
boolean x=(year%4==0);
boolean y=(year%100)!=0;
boolean z=((year%400==0)&&(year%100==0));
    if(x&&(y||z)){
      System.out.println(year+"leap year");
    }
    else{
      System.out.println(year+"not a leap year");
    }
    switch (year){
      case 2012:System.out.println("leap year");
                 break;
      case 2013: System.out.println("not a leap year");
                 break;
      case 2016:System.out.println("leap year");
                 break;
    }
  }

}
