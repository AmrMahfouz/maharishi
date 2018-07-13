package Test;

public class SameNumberOfFactors {

    public int sameNumberOfFactors(int n1, int n2) {
        if (n1 < 0 || n2 < 0) {
            return -1;
        }
        if (getNumOfFactors(n1) == getNumOfFactors(n2)) {
            return 1;
        }
        return 0;
    }

    private int getNumOfFactors(int n) {
        int numOfFactors = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                numOfFactors++;
            }
        }
        return numOfFactors;
    }

    public static void main(String[] args) {
        SameNumberOfFactors sameNumberOfFactors = new SameNumberOfFactors();
        System.out.println(sameNumberOfFactors.sameNumberOfFactors(-6, 21));
        System.out.println(sameNumberOfFactors.sameNumberOfFactors(6, 21));
        System.out.println(sameNumberOfFactors.sameNumberOfFactors(8, 12));
        System.out.println(sameNumberOfFactors.sameNumberOfFactors(23, 97));
        System.out.println(sameNumberOfFactors.sameNumberOfFactors(0, 1));
        System.out.println(sameNumberOfFactors.sameNumberOfFactors(0, 0));
    }

}
