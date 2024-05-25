package main.java.com.example;


public interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
  }
  
  class Rectangle implements Resizable {
    private int width;
    private int height;
  
    public Rectangle(int width, int height) {
      this.width = width;
      this.height = height;
    }
  
    @Override
    public void resizeWidth(int width) {
      this.width = width;
    }
  
    @Override
    public void resizeHeight(int height) {
      this.height = height;
    }
  
    
}
