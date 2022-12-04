import java.util.Scanner;

public class week4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input n:");
        int n = sc.nextInt();
        double z = 4;
        for(int i = 1; i <= n; i ++)
            z += 4*((i & 1) == 1 ? -1 : 1) / (double)(i << 1 | 1);
        System.out.println(z);
        sc.close();
    }
}
