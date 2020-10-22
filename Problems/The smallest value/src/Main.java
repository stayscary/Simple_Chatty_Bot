import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        long factorial = 1;
        int i = 0;
        while (factorial <= number) {
            factorial *= ++i;
        }
        System.out.print(i);
    }
}