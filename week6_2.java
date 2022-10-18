import java.util.Scanner;
public class week6_2 {
  class triangle {
    public static double perimeter(double a, double b, double c) {
      return a + b + c;
    }
    public static double area(double a, double b, double c) {
      double p = perimeter(a, b, c) / 2;
      return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    public static boolean isValid(double a, double b, double c) {
      return a + b > c && a + c > b && b + c > a;
    }
    public static double area(double a, double h) {
      return a * h / 2;
    }
    public static double area(double a, double b, int angle) {
      double theta = angle / 180.0 * Math.PI;
      return a * b * Math.sin(theta) / 2;
    }
  }
  public static void main(String []args) {
    Scanner in = new Scanner(System.in);
    double a, b;
    a = in.nextDouble();
    b = in.nextDouble();
    System.out.printf("The area is %.3f\n", triangle.area(a, b));
    int c;
    a = in.nextDouble();
    b = in.nextDouble();
    c = in.nextInt();
    System.out.printf("The area is %.3f\n", triangle.area(a, b, c));
  }
}
