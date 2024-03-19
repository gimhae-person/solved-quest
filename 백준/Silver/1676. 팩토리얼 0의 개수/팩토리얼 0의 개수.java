import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = 0;
        while (n >= 5) {
            result += n / 5;
            n /= 5;
        }

        System.out.println(result);
    }
}