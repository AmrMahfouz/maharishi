package Test;

public class Array123 {

    public int is123Array(int[] a) {
        if (a == null || a.length < 3 || a.length % 3 != 0) {
            return 0;
        }
        for (int i = 0; i < a.length - 2; i += 3) {
            if (a[i] != 1 || a[i + 1] != 2 || a[i + 2] != 3) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Array123 array123 = new Array123();
        System.out.println(array123.is123Array(new int[]{1, 2, 3, 3, 2, 1}));
        System.out.println(array123.is123Array(new int[]{0, 1, 2, 3, 1, 2, 3}));
        System.out.println(array123.is123Array(new int[]{1, 2, 3, 3, 2, 1, 1, 2, 3}));
        System.out.println(array123.is123Array(new int[]{1, 2, 3}));
        System.out.println(array123.is123Array(new int[]{}));
    }

}