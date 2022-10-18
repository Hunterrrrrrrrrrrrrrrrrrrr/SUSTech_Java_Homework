import java.util.Scanner;

public class a1q4 {
    public static int pd(int n) {
        if(n < 60) return 0;
        if(n < 70) return 4;
        if(n < 80) return 3;
        return n < 90 ? 2 : 1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int []a = new int[5];
        int T = in.nextInt();
        while(T --> 0) {
            int n = in.nextInt();
            a[pd(n)] ++;
        }
        for(int i = 0; i < 4; i ++)
            System.out.printf("%c: %d\n", (char)('A' + i), a[i+1]);
        in.close();
    }
}
