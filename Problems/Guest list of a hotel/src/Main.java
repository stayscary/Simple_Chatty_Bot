import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[8];
        for (int i = 0; i < 8; i++) {
            array[i] = scanner.next();
        }
        for (int j = 7; j >= 0; j--) {
            System.out.println(array[j]);
        }
    }
}