import java.util.Scanner;

import static java.lang.Character.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        StringBuilder result = new StringBuilder();
        char[] chars = str.toCharArray();
        for (char ch : chars) {
            Character c = Character.valueOf(ch);
            if (isUpperCase(c)) {
                result.append(toLowerCase(ch));
            } else {
                result.append(toUpperCase(ch));
            }
        }
        System.out.println(result.toString());
    }
}