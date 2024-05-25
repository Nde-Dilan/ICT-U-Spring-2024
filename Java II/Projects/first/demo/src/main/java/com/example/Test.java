package main.java.com.example;


interface Flyable {
    void fly_obj();
  }
  
  class Spacecraft implements Flyable {
  
    @Override
    public void fly_obj() {
      System.out.println("Spacecraft is flying");
    }
  }
  
  class Airplane implements Flyable {
  
    @Override
    public void fly_obj() {
      System.out.println("Airplane is flying");
    }
  }
  
  class Helicopter implements Flyable {
  
    @Override
    public void fly_obj() {
      System.out.println("Helicopter is flying");
    }
  }
  