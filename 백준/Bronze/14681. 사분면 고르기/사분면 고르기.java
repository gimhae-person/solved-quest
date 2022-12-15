import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long x = in.nextLong();
        long y = in.nextLong();

        if (x > 0) {
            if (y > 0) System.out.println(1);
            if (y < 0) System.out.println(4);
        } else {
            if (y > 0) System.out.println(2);
            if (y < 0) System.out.println(3);
        }
    }
}