import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = "";
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            result += "*";
            System.out.println(result);    
        }
    }
}