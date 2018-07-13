package previoustests;

import java.util.Arrays;

public class SquarPair {

    public int countSquarePairs(int[] a) {
        if (a == null || a.length < 2) {
            return 0;
        }
        Arrays.sort(a);
        int start = 0;
        int end = a.length - 1;
        int perfectSquareCount = 0;
        while (start < a.length) {
            while (start < end) {
                boolean twoNumsGreaterThanZero = a[start] > 0 && a[end] > 0;
                boolean firstLessThanSecond = a[start] < a[end];
                if (twoNumsGreaterThanZero && firstLessThanSecond && isPerfectSquare(a[start] + a[end])) {
                    perfectSquareCount++;
                }
                end--;
            }
            start++;
            end = a.length - 1;
        }
        return perfectSquareCount;
    }

    private boolean isPerfectSquare(int number) {
        double sqrt = Math.sqrt(number);
        return sqrt == (int) sqrt;
    }

    public static void main(String[] args) {
        SquarPair squarPair = new SquarPair();
        System.out.println(squarPair.countSquarePairs(new int[]{9, 0, 2, -5, 7}));
        System.out.println(squarPair.countSquarePairs(new int[]{9}));
    }

}
