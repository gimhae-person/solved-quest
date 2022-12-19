import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long N = in.nextLong();

        int i = 1;
        int result = 1;
        
        while (i < N + 1) {
            result = result * i;
            i++;
        }
       System.out.println(result);
    }
}