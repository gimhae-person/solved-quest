import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        int A;
        int B;
        
        for(int i = 1; i < T + 1; i++) {
            A = in.nextInt();
            B = in.nextInt();
            System.out.println(A + B);
        }
    }
}