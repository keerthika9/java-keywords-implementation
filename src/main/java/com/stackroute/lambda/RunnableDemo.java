package com.stackroute.lambda;
  public class RunnableDemo implements Runnable {
    @Override
    public void run() {
      System.out.println("New Thread running");
    }
}
