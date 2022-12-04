import java.util.*;
public class a3q3 {
  static int a[][] = new int[500][500];
  static int []dx = {0, 0, 1, 1}, dy = {0, 1, 0, 1};
  public static void work(int x, int y, int t) {
    a[x][y] |= t;
  }
  public static void main(String[] args) {
    double []S = new double [16];
    double ans = 0;
    for(int i = 1; i < 16; i ++)
      S[i] = 1;
    S[1] = S[2] = S[4] = S[8] = Math.PI / 4;
    S[3] = S[5] = S[10] = S[12] = Math.sqrt(3) / 4 + Math.PI / 6;
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for(int i = 1; i <= n; i ++) {
      int op = in.nextInt(), x = in.nextInt(), y = in.nextInt();
      for(int j = 0; j < 4; j ++) {
        if(op == 2) a[x + dx[j] + 200][y + dy[j] + 200] |= 15;
        else a[x + dx[j] + 200][y + dy[j] + 200] |= 1 << j;
      }
    }
    for(int i = 0; i < 400; i ++)
      for(int j = 0; j < 400; j ++)
        ans += S[a[i][j]];
    System.out.printf("%.5f\n",ans);
  }
}