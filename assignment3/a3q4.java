import java.util.*;
public class a3q4 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt(), m = in.nextInt();
    int[][] a = new int[n + 2][m + 2];
    boolean [][]vis = new boolean[n + 2][m + 2];
    for(int i = 1; i <= n; i ++) vis[i][0] = vis[i][m + 1] = true;
    for(int i = 1; i <= m; i ++) vis[0][i] = vis[n + 1][i] = true;
    int []dx = {1, 0, -1, 0};
    int []dy = {0, 1, 0, -1};
    int x = 0, y = 1, d = 0;
    for(int i = 1; i <= n * m; i ++) {
      int v = in.nextInt();
      while(vis[x + dx[d]][y + dy[d]]) d = (d + 1) & 3;
      x += dx[d]; y += dy[d];
      vis[x][y] = true; a[x][y] = v;
    }
    for(int i = 1; i <= n; i ++)
      for(int j = 1; j <= m; j ++)
        System.out.printf("%d%c", a[i][j], j == m ? '\n' : ' ');
  }
}