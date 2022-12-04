package week10;

import java.util.Scanner;

public class lab10 {
  static public void main(String[] args) {
    System.out.println("Your budget");
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    boolean output = false;
    for(PhoneModel phone : PhoneModel.values()) {
      if(phone.getPrice() <= n) {
        output = true;
        System.out.println(phone);
      }
    }
    if(!output)
      System.out.printf("You don't have sufficient money\n");
  }
}
