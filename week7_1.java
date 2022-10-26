import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
public class week7_1 {
  public static ArrayList<Food> generateMenu() {
    ArrayList<Food> A = new ArrayList<Food>();
    A.add(new Food(1, "Seafood", "pizza", 11, 12.00));
    A.add(new Food(2, "Beef", "pizza", 9, 10.00));
    A.add(new Food(3, "Seafood", "fried rice", 5, 12.00));
    A.add(new Food(4, "Beef", "noodles", 6, 14.00));
    return A;
  }
  public static void getMenu(ArrayList<Food> A) {
    System.out.println("-------------------------------------Menu-----------------------------");
    for(int i = 0; i < A.size(); i ++) {
      Food B = A.get(i);
      System.out.printf("[id] %d [type] %-10s [name] %-15s [size] %2d (Inches) %.2f $\n",
          B.getId(), B.getType().toString(), B.getName().toString(), B.getSize(), B.getPrice());
    }
    System.out.println("-------------------------------------Menu-----------------------------");
  }
  public static User generateUser() {
    Scanner in = new Scanner(System.in);
    User A = new User();
    System.out.println("Input User name:");
    String S = in.next();
    A.deposit(100);
    A.setPassword("123456");
    A.setAccount(S);
    return A;
  }
  public static void userConsume(ArrayList<Food> A, User B) {
    getMenu(A);
    System.out.println("Please input the foodID and the number you want, to exit input 0");
    Scanner in = new Scanner(System.in);
    double z = 0;
    while(true) {
      System.out.printf("Food id (input 0 to end select):\n");
      int x = in.nextInt();
      if(x == 0) break;
      System.out.println("Number of this food:");
      int y = in.nextInt();
      z += A.get(x - 1).getPrice() * y;
    }
    System.out.println("Select End");
    B.withdraw(z);
  }
  public static void main(String []args) {
    ArrayList<Food> foodList = generateMenu();
    User user = generateUser();
    user.introduce();
    userConsume(foodList,user);
    user.introduce();
  }
}
