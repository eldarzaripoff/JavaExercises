import java.util.Scanner;

public class HW2806ex915 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int num = in.nextInt();
        if (num > 0 && num < 13) {
            if (num == 1 || num == 2 || num == 12) {
                System.out.println("Winter");
            }
            if (num == 3 || num == 4 || num == 5) {
                System.out.println("Spring");
            }
            if (num == 6 || num == 7 || num == 8) {
                System.out.println("Summer");
            }
            if (num == 9 || num == 10 || num == 11) {
                System.out.println("Autumn");
            }
        }
    }
}
