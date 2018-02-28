import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number:");
        Integer n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            outputLineEmpty(n - 1 - i);
            outputLineStar(2*i + 1);

            System.out.println();
        }

    }

    private static void outputLineEmpty(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(" ");
        }
    }

    private static void outputLineStar(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }

}


