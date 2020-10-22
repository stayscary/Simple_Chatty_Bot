import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] array = new Integer[3];
        int k = scanner.nextInt();
        array[0] = k / 100;
        array[1] = (k / 10) % 10;
        array[2] = k % 10;
        if (array[0].equals(array[2]) & array[0] != 0) {
            System.out.println(array[0] + "" + array[1] + "" + array[2]);
        } else if (array[0] == 0 & array[1] == 0) {
            System.out.println(array[2] + "" + array[1] + "" + array[0]);
        } else if (array[0].equals(array[2]) & array[0] == 0) {
            System.out.println(array[1] + "" + array[0]);
        } else if (array[1].equals(array[2]) & array[1] == 0) {
            System.out.println(array[0]);
        } else if (array[2] == 0) {
            System.out.println(array[1] + "" + array[0]);
        } else {
            System.out.println(array[2] + "" + array[1] + "" + array[0]);
        }
    }
}