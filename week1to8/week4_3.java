import java.util.Scanner;

public class week4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter expressions:");
        while(true) {
            double x, y;
            x = sc.nextDouble();
            if(x == -1)
                break;
            char c = sc.next().charAt(0);
            y = sc.nextDouble();
            switch(c) {
                case '+':
                    System.out.println(x + y);
                    break;
                case '-':
                    System.out.println(x - y);
                    break;
                case '*':
                    System.out.println(x * y);
                    break;
                case '/':
                    System.out.println(x / y);
                    break;
                default:
                    System.out.println("Calc Failed");
            }
        }
        sc.close();
    }
}
