import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[5];
        for (int i = 0; i < 5; i++) {
            array[i] = scanner.next();
        }
        System.out.print("The form for " + array[0] + " is completed. " +
                         "We will contact you if we need a chef that cooks "
                         + array[4] + " dishes.");
    }
}