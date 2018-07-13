package previoustests;

public class Inertial {

    public int isInertial(int[] a) {
        int max = Integer.MIN_VALUE;
        boolean containsOddValue = false;
        int minOdd = Integer.MAX_VALUE;
        for (int n : a) {
            max = Math.max(max, n);
            if (!containsOddValue && n % 2 == 1) {
                containsOddValue = true;
            }
            if (n % 2 == 1) {
                minOdd = Math.min(minOdd, n);
            }
        }

        if (!containsOddValue) {
            return 0;
        }

        boolean maxIsEven = max % 2 == 0;
        if (!maxIsEven) {
            return 0;
        }

        for (int n : a) {
            if (n != max && n % 2 == 0 && n > minOdd) {
                return 0;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        Inertial inertial = new Inertial();
        System.out.println(inertial.isInertial(new int[]{1}));
        System.out.println(inertial.isInertial(new int[]{2}));
        System.out.println(inertial.isInertial(new int[]{1, 2, 3, 4}));
        System.out.println(inertial.isInertial(new int[]{1, 1, 1, 1, 1, 1, 2}));
        System.out.println(inertial.isInertial(new int[]{2, 12, 4, 6, 8, 11}));
        System.out.println(inertial.isInertial(new int[]{2, 12, 12, 4, 6, 8, 11}));
        System.out.println(inertial.isInertial(new int[]{-2, -4, -6, -8, -11}));
        System.out.println(inertial.isInertial(new int[]{2, 3, 5, 7}));
        System.out.println(inertial.isInertial(new int[]{2, 4, 6, 8, 10}));
    }

}
