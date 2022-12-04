import java.util.Scanner;

public class a1q3 {
    public static boolean pd(int n) {
        return n % 400 == 0 || (n % 4 == 0 && n % 100 != 0);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while(T -- > 0) {
            int n = in.nextInt();
            if(pd(n)) {
                System.out.println("Yes");
                int ans = 31*6+30*4+1;
                for(int z = n + 1; z < 2000; z ++)
                    ans += 365 + (pd(z) ? 1 : 0);
                System.out.println(ans);
            } else {
                System.out.println("No");
            }
        }
        in.close();
    }
}
