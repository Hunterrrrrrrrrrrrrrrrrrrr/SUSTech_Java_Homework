import java.math.BigInteger;
import java.util.Scanner;
public class a2q1 {
  public static void main(String []args) {
    Scanner in = new Scanner(System.in);
    int test = in.nextInt();
    while(test >= 1) {
      test --;
      int n = in.nextInt(), m = in.nextInt();
      BigInteger a = BigInteger.ZERO;
      BigInteger b = BigInteger.ZERO;
      for(int i = 0; i < n; i ++) {
        int x = in.nextInt();
        a = a.multiply(BigInteger.TEN).add(BigInteger.valueOf(x));
      }
      for(int i = 0; i < m; i ++) {
        int x = in.nextInt();
        b = b.multiply(BigInteger.TEN).add(BigInteger.valueOf(x));
      }
      a = a.add(b);
      System.out.println(a.toString());
    }
  }
}
