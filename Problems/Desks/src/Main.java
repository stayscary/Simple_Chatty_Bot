import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = 0;
        int ans = 0;
        while (scanner.hasNextInt()) {
            k = scanner.nextInt();
            if (k % 2 == 0) {
                ans += k / 2;
            } else {
                ans += k / 2 + 1;
            }
        }
        System.out.println(ans);
    }
}