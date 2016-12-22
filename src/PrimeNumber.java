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
                default:
                    System.out.println("You must enter a number from the available actions.");
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
            System.out.println();
            System.out.println(n + " is a prime number.");

        } else {
            System.out.println();
            System.out.println(n + " is not a prime number.");

        }

    }

    private static void printPrimeNumbers(int n) {

        int count = 0;

        if (n >= 2) {

            System.out.println();
            System.out.println("Prime numbers: ");

            for (int i = 0; i < n; i++) {
                if (isPrime(i)) {
                    count++;
                    if (count % 10 == 0) {
                        System.out.println(i + " ");
                    } else
                        System.out.print(i + " ");
                }
            }

            System.out.println();
            System.out.println("\nNumber of prime numbers: " + count);

        } else {
            System.out.println();
            System.out.println("You must enter a number greater than\n" +
                    "or equal to 2.");
        }

    }

    private static void printMenu() {

        System.out.println("\n Available actions: \n Enter ");
        System.out.println("0 - Check if a number is a prime number. \n" +
                "1 - Print prime numbers from 2 to n.\n" +
                "2 - Quit.\n");
    }

}
