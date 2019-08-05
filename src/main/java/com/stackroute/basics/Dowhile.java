package com.stackroute.basics;

import java.util.Scanner;

public class Dowhile {
  public static void main(String args[]) {
    int factorial = 1;int i=1;
    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();
    do {

      factorial = factorial * i;
      i++;
    } while (i<=input);
    System.out.println(factorial);
  }
}
