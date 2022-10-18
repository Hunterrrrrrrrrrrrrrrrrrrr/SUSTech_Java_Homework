import java.util.Scanner;
public class a2q2 {
  public static void main(String []args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    boolean []vis = new boolean[n + 1];
    for(int i = 0; i < n; i ++) {
      vis[in.nextInt()] = true;
    }
    boolean ok = false;
    for(int i = 1; i <= n; i ++)
      if(!vis[i]) {
        if(ok) System.out.printf(" ");
        ok = true;
        System.out.printf("%d", i);
      }
    if(!ok)
      System.out.printf("NULL");
    System.out.printf("\n");
  }
}
