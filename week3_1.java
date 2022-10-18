import java.util.Scanner;
public class week3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the interval in seconds:");
        int x = sc.nextInt();
        System.out.printf("%d h %d m %d s\n", x / 3600, x / 60 % 60, x % 60);
        sc.close();
    }
}
