public class week3_2 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        double z = 0;
        if(x >= 60)
            z ++;
        if(x >= 70)
            z ++;
        if(x >= 80)
            z ++;
        if(x >= 90)
            z ++;
        System.out.printf("Your GPA is %.1f\n", z);
    }
}
