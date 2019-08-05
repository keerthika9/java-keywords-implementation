package com.stackroute.oopsconcepts.inheritance;

public class HondaCity extends Car {
  private double maxBatteryCharge;
  private double spentBatteryCharge;
  public HondaCity(String name,  int doors, int velocity, int wheels, int gears, String direction) {
    super(name, doors, velocity, wheels, gears, direction);
  }

  public HondaCity(double maxBatteryCharge, double spentBatteryCharge)
  {
    super("Abc Model", 4, 400, 4, 4, "south");
    this.maxBatteryCharge = maxBatteryCharge;
    this.spentBatteryCharge=spentBatteryCharge;
  }
  public void checkBatteryCharge(double spentBatteryCharge) {
    System.out.println((maxBatteryCharge - spentBatteryCharge));
  }
}
