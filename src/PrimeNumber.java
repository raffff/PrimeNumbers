import java.util.Scanner;

/**
 * @author Raffi
 */
public class PrimeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean flag = false;

        while (!flag) {

            int n;
            printMenu();
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            System.out.println();

            switch (choice) {
                case 0:
                    System.out.println("Enter n: ");
                    n = sc.nextInt();
                    printPrimeNumber(n, isPrime(n));
                    break;
                case 1:
                    System.out.println("Enter n:");
                    int lastNumber = sc.nextInt();
                    printPrimeNumbers(lastNumber);
                    break;
                case 2:
                    flag = true;
                    sc.close();
                    break;
            }
        }
    }

    private static boolean isPrime(int n) {

            if (n <= 1) {
                return false;
            }

            for (int i = 2; i <= Math.sqrt(n); i++) {

                if (n % i == 0) {
                    return false;
                }

            }

        return true;
    }

    private static void printPrimeNumber(int n, boolean b) {

        if (b) {
            System.out.println(n + " is a prime number.");
            System.out.println();
        } else {
            System.out.println(n + " is not a prime number.");
            System.out.println();
        }

    }

    private static void printPrimeNumbers(int n) {

        if (n >= 2) {
            System.out.println("Prime numbers: ");
            for (int i = 2; i < n; i++) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
            }

        } else {
            System.out.println("You must enter a number greater than\n" +
                    "or equal to 2.");
        }

        System.out.println();
    }

    private static void printMenu() {

        System.out.println("\n Available actions: \n Enter ");
        System.out.println("0 - Check if a number is a prime number. \n" +
                "1 - Print prime numbers from 2 to n.\n" +
                "2 - Quit.\n");
    }

}
