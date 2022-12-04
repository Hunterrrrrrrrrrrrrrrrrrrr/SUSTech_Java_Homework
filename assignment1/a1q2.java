import java.util.Scanner;

public class a1q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while(T --> 0) {
            double x1, y1, x2, y2, x;
            x1 = in.nextDouble();
            y1 = in.nextDouble();
            x2 = in.nextDouble();
            y2 = in.nextDouble();
            x = in.nextDouble();
            double k = (y1-y2)/(x1-x2), b = y1-k*x1;
            System.out.printf("%.1f\n", k*x+b);
        }
        in.close();
    }
}
