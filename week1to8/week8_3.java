import java.util.Scanner;

public class week8_3 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s = in.nextLine();
    if(s.length() == 0) {
      System.out.println("Empty");
      return ;
    }
    StringBuilder t = new StringBuilder();
    boolean[] vis = new boolean[512];
    for (int i = 0; i < s.length(); i++) {
      char cur = s.charAt(i);
      if (cur != ' ' && !vis[cur]) {
        vis[cur] = true;
        t.append(cur);
      }
    }
    System.out.println(t.toString());
  }
}
