import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int a[][] = new int[n][m];
        int b[][] = new int[n][m];

        int answer[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                answer[i][j] = sc.nextInt();
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                answer[i][j] += sc.nextInt();
                sb.append(answer[i][j]);
                sb.append(" ");
            }
            sb.append("\n");
        }
        sc.close();
        System.out.println(sb.toString());
    }
}