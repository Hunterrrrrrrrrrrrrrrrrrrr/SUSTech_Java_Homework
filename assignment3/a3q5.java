import java.util.*;
public class a3q5 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[][] a = new int[n + 10][n + 10];
    for(int i = 1; i <= n; i ++)
      for(int j = 1; j <= n; j ++)
        a[i][j] = in.nextInt();
    boolean out = false;
    for(int i = 1; i <= n; i ++)
      for(int j = 1; j <= n; j ++) if(a[i][j] == 0) {
        int []dx = {1, 0, 1, 1};
        int []dy = {0, 1, 1, -1};
        boolean flag = false;
        for(int d = 0; d < 4; d ++) {
          int cnt = 0;
          for(int sgn = -1; sgn <= 1; sgn += 2) {
            for (int k = 1; k <= 4; k++) {
              int x = i + dx[d] * k * sgn;
              int y = j + dy[d] * k * sgn;
              if (x < 1 || y < 1 || x > n || y > n) {
                break;
              }
              if(0 == a[x][y]) {
                break;
              }
              cnt++;
            }
          }
          if(cnt >= 4) {
            flag = true;
            break;
          }
        }
        if(flag) {
          out = true;
          System.out.printf("%d %d\n", i, j);
        }
      }
    if(!out)
      System.out.println(-1);
  }
}