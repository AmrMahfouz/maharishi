package previoustests;

public class RepsEqual {

    public int repsEqual(int[] a, int n) {
        for (int i = a.length - 1; i >= 0; i--) {
            int digit = n % 10;
            n /= 10;
            if (a[i] != digit) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        RepsEqual repsEqual = new RepsEqual();
        System.out.println(repsEqual.repsEqual(new int[]{3, 2, 0, 5, 3}, 32053));
        System.out.println(repsEqual.repsEqual(new int[]{3, 2, 0, 5}, 32053));
        System.out.println(repsEqual.repsEqual(new int[]{3, 2, 0, 5, 3, 4}, 32053));
        System.out.println(repsEqual.repsEqual(new int[]{2, 3, 0, 5, 3}, 32053));
        System.out.println(repsEqual.repsEqual(new int[]{9, 3, 1, 1, 2}, 32053));
        System.out.println(repsEqual.repsEqual(new int[]{0, 3, 2, 0, 5, 3}, 32053));
    }

}
