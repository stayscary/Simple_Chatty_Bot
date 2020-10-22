import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextDouble();
        double p = scanner.nextDouble();
        double k = scanner.nextDouble();
        int counter = 0;
        while (m < k) {
            counter++;
            m = m + m * p / 100;
        }
        System.out.print(counter);
    }
}