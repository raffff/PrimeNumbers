import java.util.Scanner;

/**
 * @author Raffi
 */
public class PrimeMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean flag = false;

        while (!flag) {

            int n;
            Print.actions();
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            System.out.println();

            switch (choice) {
                case 0:
                    System.out.println("Enter n: ");
                    n = sc.nextInt();
                    isThis.Prime(n);
                    break;
                case 1:
                    System.out.println("Enter n:");
                    int lastNumber = sc.nextInt();
                    Print.PrimeNumbers(lastNumber);
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

}
