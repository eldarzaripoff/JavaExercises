import java.util.Scanner;
public class HW2806ex913 {
    public static Scanner in = new Scanner(System.in);
    public static void main (String[] args) {
        int num = in.nextInt();
        if (num > 99 && num < 1000) {
            int f = num / 100;
            int s = num / 10 % 10;
            int t = num % 10;
            if (f > s && s > t) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
