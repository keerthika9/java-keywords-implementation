package com.stackroute.basics;

import java.util.Scanner;

public class Arrays {
  public static void main(String args[]){
    int n,sum=0;
    Scanner scanner=new Scanner(System.in);
    System.out.print("Enter no. of elements you want in array:");
    n = scanner.nextInt();
    int arr[]=new int[n];
for( int i:arr){
arr[i]=scanner.nextInt();
  sum = sum + arr[i];
}
    System.out.println("Sum:"+sum);

    }
  }

