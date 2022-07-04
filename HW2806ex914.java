import java.util.Scanner;

public class HW2806ex914 {
    public static Scanner in = new Scanner(System.in);
    public static void main (String[] args) {
        int num = in.nextInt();
        if (num > 0 && num < 6) {
            if (num == 1 || num == 2) {
                System.out.println("Unsatisfactory grade");
            }
            if (num == 3) {
                System.out.println("Satisfactory grade");
            }
            if (num == 4) {
                System.out.println("Merit grade");
            }
            if (num == 5) {
                System.out.println("Excellent");
            }
        } else {
            System.out.println("Incorrect number");
        }
    }

}
