import java.util.Scanner;
public class week5_3 {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the length:\n");
        int n = in.nextInt();
        int []a = new int[n], b = new int[n];
        for(int i = 0; i < n; i ++)
            a[i] = in.nextInt();
        for(int i = 0; i < n; i ++)
            b[i] = in.nextInt();
        boolean ok = true;
        for(int i = 0; i < n && ok; i ++)
            if(a[i] != b[i])
                ok = false;
        System.out.println(ok ? "equal" : "Not equal");
        in.close();
    }
}
