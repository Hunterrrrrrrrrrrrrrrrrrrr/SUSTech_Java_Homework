import java.util.*;
public class a2q3 {
  public static void main(String []args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    while(n >= 1) {
      n --;
      int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = in.nextInt();
      int x = in.nextInt(), y = in.nextInt(), z = in.nextInt(), w = in.nextInt();
      ArrayList<Integer> V = new ArrayList<Integer>();
      for(int i = 1; i <= 30 - a; i ++) V.add(x);
      for(int i = 1; i <= 30 - b; i ++) V.add(y);
      for(int i = 1; i <= 30 - c; i ++) V.add(z);
      for(int i = 1; i <= 30 - d; i ++) V.add(w);
      Collections.sort(V);
      int ans = 0;
      for(int i = 1; i <= 100 - (a+b+c+d); i ++)
        ans += V.get(i-1);
      System.out.printf("%d\n", ans);
    }
  }
}
