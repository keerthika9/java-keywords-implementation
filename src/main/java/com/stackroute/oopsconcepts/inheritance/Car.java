package com.stackroute.oopsconcepts.inheritance;

public class Car extends Vehicle {
//fields of the class
  private int wheels;
  private int gears;
//genearting constructor and passing parameters
  public Car(String name,  int doors, int velocity, int wheels, int gears, String direction) {
    super(name, doors,velocity,direction);
    this.wheels = wheels;
    this.gears=gears;
  }

  public void handSteering (char ch) {
    switch (ch) {
      case 'R':
        System.out.println("car is turning right");
        break;
      case 'L':
        System.out.println("Car is turning left");
        break;
      case 'B':
        System.out.println("Car is turning back");
      default:
        System.out.println("This vehicle is a Car and it is not turning.");
        break;
    }

  }

  public void gearChange(char ch1) {
    switch (ch1) {
      case '1':
        System.out.println("This Car is in first gear.");
        break;
      case '2':
        System.out.println("This Car is in second gear.");
        break;
      case '3':
        System.out.println("This Car is in third gear.");
        break;
      case 'N':
        System.out.println("This Car is in neutral position.");
        break;
      case 'D':
        System.out.println("This car is in drive position.");
        break;

      default:
        System.out.println("invalid input.");
        break;
    }

  }

  public void Acceleration(int initialSpeed) {
    initialSpeed = initialSpeed + 100;
    System.out.println("Speed is now " + initialSpeed);
  }

  public void Deceleration(int initialSpeed){
    initialSpeed = initialSpeed - 100;
    System.out.println("Speed is now " + initialSpeed);
  }

}
