import javax.script.ScriptContext;
import java.util.*;
public class a2q4 {
  public static int ID(char c) {
    if(c == 'S') return 0;
    if(c == 'H') return 1;
    if(c == 'D') return 2;
    return 3;
  }
  public static void main(String []args) {
    Scanner in = new Scanner(System.in);
    int []cnt = new int[14], c = new int[4];
    for(int i = 0; i < 5; i ++) {
      c[ID(in.next().charAt(0))]++;
      cnt[in.nextInt()]++;
    }
    int l = 13, r = 1;
    for(int i = 1; i <= 13; i ++)
      if(cnt[i] >= 1) {
        l = i < l ? i : l;
        r = i > r ? i : r;
      }
    int m_cnt = 0, mc = 0;
    for(int i = 1; i <= 13; i ++)
      if(m_cnt < cnt[i])
        m_cnt = cnt[i];
    for(int i = 0; i < 4; i ++)
      if(mc < c[i])
        mc = c[i];
    if(mc == 5 && m_cnt == 1 && r - l + 1 == 5)
      System.out.printf("Straight Flush\n");
    else if(mc == 5)
      System.out.printf("Flush\n");
    else if(m_cnt == 1 && r - l + 1 == 5)
      System.out.printf("Straight\n");
    else if(m_cnt >= 3)
      System.out.printf("Three of a Kind\n");
    else if(m_cnt >= 2)
      System.out.printf("Pair\n");
    else
      System.out.printf("High Card\n");
  }
}
