package main.java.com.example;


public interface Flyable {
    void fly_obj();
  }
  
  
  class Helicopter implements Flyable {
  
    @Override
    public void fly_obj() {
      System.out.println("Helicopter is flying");
    }
  }