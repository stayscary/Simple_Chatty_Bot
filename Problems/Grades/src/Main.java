import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int[] answer = new int[4];
        for (int i = 0; i < k; i++) {
            int grade = scanner.nextInt();
            if (grade == 5) {
                answer[3]++;
            } else if (grade == 4) {
                answer[2]++;
            } else if (grade == 3) {
                answer[1]++;
            } else {
                answer[0]++;
            }
        }
        for (int i = 0; i < 4; i ++) {
            System.out.print(answer[i] + " ");
        }
    }
}