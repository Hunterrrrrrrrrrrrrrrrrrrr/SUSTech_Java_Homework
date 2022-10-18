import java.util.Scanner;
public class pro66 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = {0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1};
        for(int i = 1; i <= n; i ++) {
            int x;
            x = in.nextInt();
            System.out.println(a[x] == 1 ? "yes" : "no");
        }
        in.close();
    }
}
