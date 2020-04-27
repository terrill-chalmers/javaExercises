import java.util.Arrays;

public class Fibonacci {
    // get range ahead of time. Need BigInteger?

    public static void getNthFibonacci(int nth) {
        // ensure we don't set array[0]
        if (nth == 0) {
            System.out.println(0);
        }

        // create and fill array
        long[] calculated = new long[nth + 1];
        Arrays.fill(calculated, -1);
        calculated[0] = 0;
        calculated[1] = 1;

        try {
            System.out.println(getNthFibonacci(nth, calculated));
        } catch (StackOverflowError e) {
            System.out.println("oops");
        }
    }

    private static long getNthFibonacci(int nth, long[] calculated) {
        if (calculated[nth] == -1) {
            calculated[nth] = getNthFibonacci(nth - 1, calculated) + getNthFibonacci(nth - 2, calculated);
        }
        return calculated[nth];
    }
}
