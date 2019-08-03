package com.stackroute;

import java.util.Scanner;

public class MultidimensionalArray {
  public static void main(String[] args) {
    int rows, columns,i,j;
    System.out.println("enter no.of rows");
    Scanner scanner = new Scanner(System.in);
    rows = scanner.nextInt();
    System.out.println("enter no.of coloumns");
    columns = scanner.nextInt();
    int a[][] = new int[rows][columns];
    int b[][] = new int[rows][columns];
    System.out.println("enter elements in to a array");
    for ( i = 0; i < rows; i++) {
      for ( j = 0; j < columns; j++) {
        a[i][j] = scanner.nextInt();
      }
    }
    System.out.println("enter elements in to b array");
    for ( i = 0; i < rows; i++) {
      for ( j = 0; j < columns; j++) {
        b[i][j] = scanner.nextInt();
      }
    }
    // Adding Two matrices
    int[][] sum = new int[rows][columns];
    for ( i = 0; i < rows; i++) {
      for ( j = 0; j < columns; j++) {
        sum[i][j] = a[i][j] + b[i][j];
        System.out.println(sum[i][j]);
      }

    }

  }
}

