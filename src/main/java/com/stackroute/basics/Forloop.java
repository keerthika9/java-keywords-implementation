package com.stackroute.basics;

import java.util.Scanner;

public class Forloop {
  public static void main(String args[]){
    System.out.println("enter input");
    Scanner scanner=new Scanner(System.in);
    int input=scanner.nextInt();
    for(int i=0; i<=input;i++){
      for(int j=0;j<=i;j++){
        System.out.print(j);
      }
      System.out.println(" ");
    }


  }

}
