import java.util.*;
public class a3q2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[][] a = new int[n + 2][n + 2];
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        a[i][j] = in.nextInt();
      }
    }
    int ans = 0;
    for (int i = 0; i <= n; i++)
      for (int j = 0; j <= n; j++) {
        ans += a[i][j] ^ a[i + 1][j];
        ans += a[i][j] ^ a[i][j + 1];
      }
    System.out.println(ans);
  }
}
