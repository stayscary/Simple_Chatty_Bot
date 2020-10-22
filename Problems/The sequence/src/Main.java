import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        while (scanner.hasNext()) {
            int min = scanner.nextInt();
            if (min % 4 == 0) {
                max = Math.max(max, min);
            }
        }
        System.out.print(max);
    }
}