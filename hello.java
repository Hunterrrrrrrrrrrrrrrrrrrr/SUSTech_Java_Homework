import java.util.Scanner;
public class hello {
    public static void main(String[] args) {
        System.out.println("Great");
        Scanner input = new Scanner(System.in);
        int x, y, z;
        x = input.nextInt();
        y = input.nextInt();
        z = x + y;
        System.out.printf("%d + %d = %d\n", x, y, z);
        for(int i = 1; i <= 8; i ++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("*");
            }
            System.out.print("\n");
        }
    }
}
