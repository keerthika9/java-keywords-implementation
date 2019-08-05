package com.stackroute.basics;

import java.util.Scanner;

public class WhileLoop {
  public static void main(String args[]) {
    int a = 0, b = 1, c = 0;
    System.out.println("enter limit");
    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();
    System.out.print("Fibonacci Series : " + a + "  " + b + "  ");
    c=a+b;
    input = input - 2;
    while (input > 0) {
      System.out.print(c + "  ");
      a=b;
      b = c;
      c = a + b;
      input--;
    }
  }
}
