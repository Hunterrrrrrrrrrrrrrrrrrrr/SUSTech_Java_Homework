package week10;

public enum PhoneModel {
  IPHONE("IPHONE", 9999),
  HUAWEI("HUAWEI", 8888),
  PIXEL("PIXEL", 6666),
  SAMSUNG("SAMSUNG", 9399),
  LG("LG", 5588);
  
  private final String name;
  private final int price;
  PhoneModel(String s, int c) {
    this.name = s;
    this.price = c;
  }
  
  public String getName() {
    return name;
  }
  
  public int getPrice() {
    return price;
  }
  
  @Override
  public String toString() {
    return String.format("%-20s Price: %d", getName(), getPrice());
  }
}
