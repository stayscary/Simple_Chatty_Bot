import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.print(str.substring(n, m + 1));
    }
}