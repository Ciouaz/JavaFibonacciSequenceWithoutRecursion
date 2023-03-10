public class FibonacciWithoutRecursion {
    public static void main(String[] args) {

        Sequence sequence = new Sequence();

        System.out.print("The list of first 20 terms in the Fibonacci Sequence:");
        for (int n = 1; n <= 20; n++) {
            System.out.print(" " + sequence.fib(n));
        }

        //Testing:
//      long fib1 = sequence.fib(1);
//      long fib2 = sequence.fib(2);
//      long fibErr = sequence.fib(-4);
//      long fib5 = sequence.fib(5);
//      long fib10 = sequence.fib(10);
//
//      System.out.printf("\nFib 1: wanted 0, has " + fib1);
//      System.out.println("Fib 2: wanted 1, has " + fib2);
//      System.out.println(fibErr);
//      System.out.println("Fib 5: wanted 5, has " + fib5);
//      System.out.println("Fib 10: wanted 34, has " + fib10);

    }
}