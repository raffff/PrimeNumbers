/**
 * @author Raffi
 */
class Print {


    static void PrimeNumbers(int n) {

        int count = 0;
        int loopCount = 0;


        if (n >= 2) {

            System.out.println();
            System.out.println("Prime numbers: ");


            for (int i = 2; i <= n; i++, loopCount++) {

                if (isPrime(i)) {

                    count++;
                    if (count % 10 == 0) {

                        System.out.println(i + " ");
                    } else {
                        System.out.print(i + " ");
                    }
                }
            }

            System.out.println();
            System.out.println("Number of prime numbers: " + count);
            System.out.println("Number of loops: " + loopCount);

        } else {
            System.out.println();
            System.out.println("You must enter a number greater than\n" +
                    "or equal to 2.");
        }
    }

    private static boolean isPrime(int n) {

        int i;

        if (n <= 1) {
            return false;
        }

        for (i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }


    static void actions() {

        System.out.println("\n Available actions: \n Enter ");
        System.out.println("0 - Check if a number is a prime number. \n" +
                "1 - Print prime numbers from 2 to n.\n" +
                "2 - Quit.\n");
    }

}
