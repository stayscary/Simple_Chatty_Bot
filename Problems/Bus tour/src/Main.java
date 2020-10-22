import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int busHeight = scanner.nextInt();
        int n = scanner.nextInt();
        int counter = 1;
        while (scanner.hasNext()) {
            int bridgeHeight = scanner.nextInt();
            if (busHeight >= bridgeHeight) {
                break;
            }
            counter++;
        }
        if (counter > n) {
            System.out.println("Will not crash");
        } else {
            System.out.println("Will crash on bridge " + counter);
        }
    }
}