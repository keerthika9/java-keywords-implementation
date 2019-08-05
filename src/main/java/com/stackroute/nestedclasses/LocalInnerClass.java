package com.stackroute.nestedclasses;

public class LocalInnerClass {
    private int number=10;
    void display(){
    class Local{
      void msg()
      {
        System.out.println(number);
      }
    }
    Local local=new Local();
    local.msg();
  }
    public static void main(String args[]){
    LocalInnerClass obj=new LocalInnerClass();
    obj.display();
  }
}
