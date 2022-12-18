import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long N = in.nextLong();

        int i = 1;
        while (i < N + 1) {
            System.out.println(i);

            i++;
        }
    }
}