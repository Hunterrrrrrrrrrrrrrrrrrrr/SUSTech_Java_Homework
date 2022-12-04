import java.util.Locale;
import java.util.Scanner;

import static java.util.Collections.reverse;

public class week8_2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String end = new String("quit");
    while(true) {
      String s = new String();
      s = in.next();
      if(s.equals(end))
        break;
      s = s.toLowerCase();
      boolean tag = true;
      for(int i = 0; i < s.length(); i ++)
        if(s.charAt(i) != s.charAt(s.length() - 1 - i))
          tag = false;
      if(tag) {
        System.out.println("Palindrome");
      } else {
        System.out.println("Not palindrome");
      }
    }
  }
}
