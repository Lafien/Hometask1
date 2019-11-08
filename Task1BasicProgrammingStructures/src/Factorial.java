import java.math.BigDecimal;
import java.util.Objects;

class Factorial {
    private static BigDecimal integer = BigDecimal.valueOf(1);
    int n;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Factorial factorial = (Factorial) o;
        return n == factorial.n;
    }

    @Override
    public int hashCode() {
        return Objects.hash(n);
    }

    Factorial(int n) {
        this.n = n;
    }

    static String factorial(int n) {
        String mess;
        long startTime = System.nanoTime();
        if (n == 0 || n == 1) {
            long estimatedTime = System.nanoTime() - startTime;
            mess = "Time on Factorial loop:" + estimatedTime / 1000000000.0 + " sec" + "\nFactorial loop number: 1";
            return mess;

        }
        if (n < 0) {
            mess = "Why do you need a factorial of a negative number?";
            return mess;
        }

        while (n != 1) {
            integer = integer.multiply(BigDecimal.valueOf(n));
            n--;
        }
        long estimatedTime = System.nanoTime() - startTime;
        mess = "Time on Factorial loop:" + estimatedTime / 1000000000.0 + " sec" + "\nFactorial loop number: " + integer.toString();
        return mess;
    }

    static String factorialRecurse(int n) {
        String mess = "";
        long startTime = System.nanoTime();
        BigDecimal result = BigDecimal.valueOf(1);

        if (n == 0) {
            long estimatedTime = System.nanoTime() - startTime;
            mess = "Time on Factorial recurse:" + estimatedTime / 1000000000.0 + " sec" + "\nFactorial recurse number: 1";
            return mess;
        }

        if (n < 0) {
            mess = "Why do you need a factorial of a negative number?";
            return mess;
        }

        for (int fact = 1; fact <= n; fact++) {
            result = result.multiply(BigDecimal.valueOf(fact));
        }
        long estimatedTime = System.nanoTime() - startTime;
        mess = "Time on Factorial recurse:" + estimatedTime / 1000000000.0 + " sec" + "\nFactorial recurse number: " + result.toString();
        return mess;

    }
}