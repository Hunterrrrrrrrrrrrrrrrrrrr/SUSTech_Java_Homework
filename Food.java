public class Food {
  private int id, size;
  private double price;
  private String name, type;
  Food(int id, String type, String name, int size, double price) {
    this.id = id;
    this.type = type;
    this.name = name;
    this.size = size;
    this.price = price;
  }
  public int getId() {
    return id;
  }
  
  public void setId(int id) {
    this.id = id;
  }
  
  public int getSize() {
    return size;
  }
  
  public void setSize(int size) {
    this.size = size;
  }
  
  public double getPrice() {
    return price;
  }
  
  public void setPrice(double price) {
    this.price = price;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getType() {
    return type;
  }
  
  public void setType(String type) {
    this.type = type;
  }
  
}
