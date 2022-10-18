import java.util.Scanner;
public class week5_2 {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the 10 scores:\n");
        double sum = 0, mx = 0, mn = 100;
        for(int i = 0; i < 10; i ++) {
            double x = in.nextDouble();
            if(x < mn) mn = x;
            if(x > mx) mx = x;
            sum += x;
        }
        System.out.println("Average score = " + (sum - mx - mn) / 8);
        in.close();
    }
}
