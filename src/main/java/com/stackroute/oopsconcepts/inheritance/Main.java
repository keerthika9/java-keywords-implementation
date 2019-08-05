package com.stackroute.oopsconcepts.inheritance;

public class Main {
  //main method
  public static void main(String[] args){
    Car car=new Car("abc",4,40,4,4,"east");
    car.gearChange('1');
    car.Acceleration(40);
    car.Deceleration(60);
    car.handSteering('R');
    HondaCity hondaCity= new HondaCity(3000,3000);
    hondaCity.checkBatteryCharge(2000);


  }
}
