package previoustests;

public class PrimeNumber {

    public int findProcupineNumber(int n) {
        while (true) {
            n++;
            if (getFirstDigit(n) == 9 && isPrime(n) && isNextPrimeLastDigit9(n)) {
                return n;
            }
        }
    }

    private boolean isNextPrimeLastDigit9(int n) {
        while (true) {
            n++;
            if (isPrime(n)) {
                if (getFirstDigit(n) == 9) {
                    return true;
                } else {
                    return false;
                }
            }
        }
    }

    private boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private int getFirstDigit(int n) {
        return n % 10;
    }

    public static void main(String[] args) {
        PrimeNumber primeNumber = new PrimeNumber();
        System.out.println(primeNumber.findProcupineNumber(0));
        System.out.println(primeNumber.findProcupineNumber(138));
        System.out.println(primeNumber.findProcupineNumber(139));
    }

}
