/**
 * @author Raffi
 */
 class isThis {

     static boolean Prime(int n) {

        int i;


        System.out.println();
        System.out.println("Big O(\u221An) complexity.");
        System.out.println("Value of \u221An = " + Math.sqrt(n));
         System.out.println();

        if (n <= 1) {
            System.out.println(n + " is not a prime number.");
            return false;
        }

        for (i = 2; i <= Math.sqrt(n); i++) {

            if (n % i == 0) {
                System.out.println(n + " is not a prime number.");
                System.out.println("Total number of loops executed: " + i);
                return false;
            }

        }

        System.out.println(n + " is a prime number.");
        System.out.println("Total number of loops executed: " + i);
        return true;

    }
}
