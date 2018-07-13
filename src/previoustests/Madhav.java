package previoustests;

public class Madhav {

    public int isMadhav(int[] a) {
        int start = 0;
        int count = 0;
        int sum = 0;
        while (start < a.length) {
            int end = start + count;
            if (end >= a.length) {
                return 0;
            }
            int nextSum = 0;
            for (int i = 0; i <= count; i++) {
                if (start == 0) {
                    sum = a[start];
                }
                nextSum += a[i + start];
            }
            if (sum != nextSum) {
                return 0;
            }
            start += (count + 1);
            count++;
        }
        return 1;
    }

    public static void main(String[] args) {
        Madhav madhav = new Madhav();
        System.out.println(madhav.isMadhav(new int[]{2, 1, 1}));
        System.out.println(madhav.isMadhav(new int[]{2, 1, 1, 4, -1, -1}));
        System.out.println(madhav.isMadhav(new int[]{6, 2, 4, 2, 2, 2, 1, 5, 0, 0}));
        System.out.println(madhav.isMadhav(new int[]{18, 9, 10, 6, 6, 6}));
        System.out.println(madhav.isMadhav(new int[]{-6, -3, -3, 8, -5, -4}));
        System.out.println(madhav.isMadhav(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1}));
        System.out.println(madhav.isMadhav(new int[]{3, 1, 2, 3, 0}));
    }

}
