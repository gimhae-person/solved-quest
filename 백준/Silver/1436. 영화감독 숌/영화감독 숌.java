import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result  = 666;

        int i = 1;
        while (i != n) {
            result ++;
            if (String.valueOf(result).contains("666")) {
                i++;
            }
        }
        System.out.println(result);
    }
}