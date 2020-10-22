import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt();
        int max = scanner.nextInt();
        int k = 0;
        double sum = 0;
        for (int i = min; i <= max; i++) {
            if (i % 3 == 0) {
                k++;
                sum += i;
            }
        }
        System.out.print(sum / k);
    }
}