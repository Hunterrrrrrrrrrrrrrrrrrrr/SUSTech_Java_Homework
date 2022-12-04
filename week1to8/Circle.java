import static java.lang.Math.sqrt;

public class Circle {
  private int id;
  private double x, y, r;
  
  public int getId() {
    return id;
  }
  
  public void setId(int id) {
    this.id = id;
  }
  
  public double getX() {
    return x;
  }
  
  public void setX(double x) {
    this.x = x;
  }
  
  public double getY() {
    return y;
  }
  
  public void setY(double y) {
    this.y = y;
  }
  
  public double getR() {
    return r;
  }
  
  public void setR(double r) {
    this.r = r;
  }
  
  public Circle(int id, double x, double y, double r) {
    this.id = id;
    this.x = x;
    this.y = y;
    this.r = r;
  }
  
  @Override
  public String toString() {
    return "Circle #" + id + ": radius = " + String.format("%.2f", r) + ", x = " + String.format("%.2f", x)  + ", y = " + String.format("%.2f", y) ;
  }
  double distanceToOrigin() {
    return sqrt(x * x + y * y);
  }
}
