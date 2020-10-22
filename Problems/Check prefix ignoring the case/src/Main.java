import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.print(str.toLowerCase().startsWith("j"));

        int a = 10;
        int b = 20;
        int c = 30;
        int d = c : 10 ? a + b == c;
    }
}