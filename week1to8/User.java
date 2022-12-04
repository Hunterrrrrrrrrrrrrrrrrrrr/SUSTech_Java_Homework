import java.util.Scanner;
public class User {
  private String account, password;
  private double money;
  
  public void setAccount(String account) {
    this.account = account;
  }
  
  public void setPassword(String password) {
    this.password = password;
  }
  
  public void withdraw(double money) {
    if(this.money < money) {
      System.out.printf("Plan to withdraw %.2f dollar, but no sufficient balance\n", money);
      return ;
    }
    System.out.printf("Plan to withdraw %.2f dollar, okay\n", money);
    String cur;
    Scanner in = new Scanner(System.in);
    int times = 3;
    while(true) {
      System.out.println("Please input your password:");
      cur = in.next();
      if(cur.equals(password)) {
        break;
      }
      -- times;
      System.out.printf("Wrong password, There are %d times left to try\n", times);
      if(times == 0) break;
    }
    if(times == 0) {
      System.out.println("Wrong Password. Exit.");
      return ;
    }
    this.money -= money;
    System.out.printf("Withdraw %.2f dollor and balance is %.2f\n", money, this.money);
  }
  public void deposit(double money) {
    this.money += money;
    System.out.printf("Got %.2f as income, balance is %.2f dollor\n", money, this.money);
  }
  public void introduce() {
    System.out.printf("%s's account has a balance of %.2f dollors\n", account.toString(), money);
  }
}