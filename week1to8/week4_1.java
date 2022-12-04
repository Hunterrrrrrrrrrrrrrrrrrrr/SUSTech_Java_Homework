import java.util.Scanner;

public class week4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Please input a number to print the Multiplication Table [0 to terminate]:");
            int x;
            x = sc.nextInt();
            if(x == 0) break;
            if(x < 0) continue ;
            for(int i = 1; i <= x; i ++, System.out.println())
                for(int j = 1; j <= i; j ++)
                    System.out.printf("%d * %d = %d ", i, j, i*j);
        }
        sc.close();
    }
}
