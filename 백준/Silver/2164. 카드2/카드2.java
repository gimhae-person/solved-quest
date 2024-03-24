import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Queue<Integer> cardQue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            cardQue.offer(i);
        }

        int i = 1;
        while (cardQue.size() != 1) {
            if (i % 2 != 0) {
                cardQue.remove();
            } else {
                cardQue.offer(cardQue.poll());
            }
            i++;
        }

        System.out.println(cardQue.poll());
    }
}