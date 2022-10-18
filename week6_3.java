import java.util.Scanner;
public class week6_3 {
  public static void main(String []args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt(), m = in.nextInt();
    int[][] a = new int[n + 1][m + 1];
    int[] b = new int[n + 1];
    
    for (int i = 1; i <= n; i++) {
      b[i] = 0;
      for (int j = 1; j <= m; j++) {
        a[i][j] = in.nextInt();
        b[i] += a[i][j];
      }
    }
    System.out.printf("\t\t");
    for(int i = 1; i <= n; i ++)
      System.out.printf(" Course%d ", i);
    System.out.printf(" Average\n");
    for (int j = 1; j <= m; j++) {
      System.out.printf("Student%d", j);
      double sum = 0;
      for (int i = 1; i <= n; i++) {
        System.out.printf("\t%d\t", a[i][j]);
        sum += a[i][j];
      }
      System.out.printf("\t%.2f\n", sum / n);
    }
    System.out.printf("Average");
    for (int i = 1; i <= n; i++)
      System.out.printf("  %.2f ", b[i] / (double) m);
    System.out.printf("\n");
  }
}
