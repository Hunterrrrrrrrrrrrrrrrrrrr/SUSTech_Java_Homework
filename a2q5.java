import javax.script.ScriptContext;
import java.util.*;
public class a2q5 {
  public static void main(String []args) {
    Scanner in = new Scanner(System.in);
    int []a = {6, 7, 4, 5, 2, 3, 0, 1};
    int n = in.nextInt();
    for(int i = 0; i < n; i ++) {
      String z = in.next();
      //6 7 4 5 2 3 0 1
      for(int j = 0; j < 8; j ++) {
        System.out.printf("%c", z.charAt(a[j]));
      }
      if(i != n - 1)
        System.out.printf(" ");
    }
  }
}
