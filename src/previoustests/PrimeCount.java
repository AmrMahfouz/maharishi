package previoustests;

public class PrimeCount {

    public int primeCount(int start, int end) {
        if (start > end) {
            return 0;
        }
        int primeCount = 0;
        for (int i = start; i <= end; i++) {
            if (i > 1 && isPrime(i)) {
                primeCount++;
            }
        }
        return primeCount;
    }

    private boolean isPrime(int number) {
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        PrimeCount primeCount = new PrimeCount();
        System.out.println(primeCount.primeCount(10, 30));
        System.out.println(primeCount.primeCount(11, 29));
        System.out.println(primeCount.primeCount(20, 22));
        System.out.println(primeCount.primeCount(1, 1));
        System.out.println(primeCount.primeCount(5, 5));
        System.out.println(primeCount.primeCount(6, 2));
        System.out.println(primeCount.primeCount(-10, 6));
    }

}
