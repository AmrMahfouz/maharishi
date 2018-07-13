package previoustests;

public class Centered15 {

    public int isCentered15(int[] a) {
        int sum = 0;
        for (int n : a) {
            sum += n;
        }
        if (sum == 15) {
            return 1;
        }
        int start = 0;
        int end = a.length - 1;
        while (start < end) {
            sum -= (a[start] + a[end]);
            if (sum == 15) {
                return 1;
            }
            start++;
            end--;
        }
        return 0;
    }

    public static void main(String[] args) {
        Centered15 centered15 = new Centered15();
        System.out.println(centered15.isCentered15(new int[]{3, 2, 10, 4, 1, 6, 9}));
        System.out.println(centered15.isCentered15(new int[]{2, 10, 4, 1, 6, 9}));
        System.out.println(centered15.isCentered15(new int[]{3, 2, 10, 4, 1, 6}));
        System.out.println(centered15.isCentered15(new int[]{1, 1, 8, 3, 1, 1}));
        System.out.println(centered15.isCentered15(new int[]{9, 15, 6}));
        System.out.println(centered15.isCentered15(new int[]{1, 1, 2, 2, 1, 1}));
        System.out.println(centered15.isCentered15(new int[]{1, 1, 15, -1, -1}));
    }

}
