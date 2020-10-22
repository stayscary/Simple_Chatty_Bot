import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int previousNumber;
        int number;
        boolean isAscending = true;
        boolean isDescending = true;
        previousNumber = scanner.nextInt();
        while (previousNumber == 0) {
            previousNumber = scanner.nextInt();
        }
        while (true) {
            number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            isDescending = isDescending && previousNumber >= number;
            isAscending = isAscending && previousNumber <= number;
            if (!isAscending && !isDescending) {
                break;
            }
            previousNumber = number;
        }
        System.out.println(isAscending || isDescending);
    }
}