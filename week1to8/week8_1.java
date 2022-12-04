import java.util.Random;

public class week8_1 {
  public static void main(String[] args) {
    Random random = new Random();
    int n = random.nextInt(5) + 5;
    Circle c1 = new Circle(0, 0, 0, 1e9);
    Circle c2 = new Circle(0, 0, 0, 0);
    for (int i = 0; i < n; i++) {
      double r = random.nextDouble() * 2 + 1.0;
      double x = random.nextDouble() * 3 + 2.0;
      double y = random.nextDouble() * 3 + 2.0;
      Circle c = new Circle(i+1, r, x, y);
      System.out.println(c);
      if(c.getR() < c1.getR())
        c1 = c;
      if(c.distanceToOrigin() > c2.distanceToOrigin())
        c2 = c;
    }
    System.out.printf("Smallest circle: %s\n", c1.toString());
    System.out.printf("Furthest circle: %s\n", c2.toString());
  }
}
