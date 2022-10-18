import java.util.Scanner;
public class week5_1 {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the length:");
        int n = in.nextInt();
        double []a = new double[n];
        System.out.printf("Input %d elements:\n", n);
        for(int i = 0; i < n; i ++)
            a[i] = in.nextDouble();
        double []b = new double[n];
        for(int i = 0; i < n; i ++)
            b[i] = i >= 1 ? a[i - 1] : a[n - 1];
        System.out.printf("list1:");
        for(int i = 0; i < n; i ++)
            System.out.print(" " + a[i]);
        System.out.printf("\n");
        System.out.printf("list2:");
        for(int i = 0; i < n; i ++)
            System.out.print(" " + b[i]);
        System.out.printf("\n");
        in.close();
    }
}
