import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String longest = "";
        ArrayList<String> strArr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (s.length() > longest.length()) {
                longest = s;
            }
            strArr.add(s);
        }
        ArrayList<String> resultArr = (ArrayList<String>) strArr.stream()
                .distinct()
                .sorted()
                .sorted(Comparator.comparing(s -> s.length()))
                .collect(Collectors.toList());

        for (String str : resultArr) {
            System.out.println(str);
        }
    }
}