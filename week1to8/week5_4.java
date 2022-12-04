import java.util.Scanner;
public class week5_4 {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the some integers in [1, 100] and end with 0:\n");
        int []cnt = new int[105];
        while(true) {
            int x = in.nextInt();
            if(x == 0) break;
            cnt[x] ++;
        }
        for(int i = 1; i <= 100; i ++)
            if(cnt[i] >= 1)
                System.out.printf("%d occurs %d %s\n", i, cnt[i], cnt[i] > 1 ? "times" : "time");
    }
}
