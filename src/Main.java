import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number:");
        Integer n = scanner.nextInt();

        List<Integer> factors = primeFactors(n);

        System.out.print(Arrays.asList(factors));

    }

    private static List<Integer> primeFactors(int n) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i <n; i++) {
            if (n % i == 0) {
                factors.add(i);
            }
        }
        return factors ;
    }


}


