import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number:");
        Integer n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            outputLineStar(i);
        }

    }

    private static void outputLineStar(int n) {
        for(int i =0; i<n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
