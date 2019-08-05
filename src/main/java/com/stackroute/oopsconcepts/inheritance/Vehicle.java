package com.stackroute.oopsconcepts.inheritance;

public class Vehicle {
//fields of the class
    private String name;
    private int doors;
    private int velocity;
    public String direction;
//creating the constructor and passing arguments
    public Vehicle(String name, int doors,int velocity,String direction) {
      this.name = name;
      this.doors = doors;
      this.velocity=velocity;
      this.direction=direction;
    }

    public void startVehicle() {
      System.out.println(" Vehicle is now on");
    }
    public int getVelocity() {
    return velocity;
  }

    public String getDirection() {
    return direction;
  }

    public void stop() {
    this.velocity = 0;
  }

    public String getName() {
      return name;
    }

    public int getDoors() {
      return doors;
    }

  }


