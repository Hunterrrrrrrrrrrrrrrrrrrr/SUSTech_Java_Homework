import java.util.Scanner;
public class triangle {
  public static double perimeter(double a, double b, double c) {
    return a + b + c;
  }
  public static double area(double a, double b, double c) {
    double p = perimeter(a, b, c) / 2;
    return sqrt(p * (p - a) * (p - b) * (p - c));
  }
  public static boolean isValid(double a, double b, double c) {
    return a + b > c && a + c > b && b + c > a;
  }
}
public class week6_1 {
  public static void main(String []args) {
    Scanner in = new Scanner(System.in);
    double a, b, c;
    while(1) {
      a = in.nextDouble();
      if(a == -1) {
        System.out.println("Have a nice day!");
        break;
      }
      if()
    }
  }
}
