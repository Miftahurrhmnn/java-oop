// Inheritance (pewarisan)

public class Car extends Vehicle {
  private String modelName;

  // Constructor: wajib panggil super()
  public Car(String color, float price, String modelName) {
    super(color, price);
    this.modelName = modelName;
  }

  public void displayInfo() {
    displayCar();
    System.out.println("Color: " + color);
    System.out.println("Model: " + modelName);
  }

  public static void main(String[] args) {
    Car myCar = new Car("Red", 35000.5f, "Alphard");
    myCar.displayInfo();
  }
}


class Vehicle {
  protected String brand = "Toyota";
  String color;
  float price;

  public Vehicle(String color, float price) {
    this.color = color;
    this.price = price;
  }

  public String getColor() { return color; }
  public float getPrice() { return price; }

  public void setColor( String color) { this.color = color; }
  public void setColor( float price) { this.price = price; }

  public void displayCar() {
    System.out.println("Brand: " + brand);
    System.out.println("Price: " + price);
  }
}