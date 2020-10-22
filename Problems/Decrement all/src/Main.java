import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int k = scanner.nextInt();
            System.out.print(--k + " ");
        }
    }
}