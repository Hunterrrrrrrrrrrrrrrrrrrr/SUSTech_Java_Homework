import java.util.Scanner;
public class week6_1 {
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
  }
  public static void main(String []args) {
    Scanner in = new Scanner(System.in);
    double a, b, c;
    while (true) {
      a = in.nextDouble();
      if (a == -1) {
        System.out.println("Have a nice day!");
        break;
      }
      b = in.nextDouble();
      c = in.nextDouble();
      if (!triangle.isValid(a, b, c)) {
        System.out.println("Invalid input!");
        continue;
      }
      System.out.printf("The area is %.3f\n", triangle.area(a, b, c));
      System.out.printf("The perimeter is %.3f\n", triangle.perimeter(a, b, c));
    }
  }
}
