package Test;

public class MercurialArray {

    public int isMercurial(int[] a) {
        int firstOneIndex = -1;
        int lastOndIndex = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                firstOneIndex = i;
                break;
            }
        }
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] == 1) {
                lastOndIndex = i;
                break;
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 3 && firstOneIndex < i && i < lastOndIndex) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        MercurialArray mercurialArray = new MercurialArray();
        System.out.println(mercurialArray.isMercurial(new int[] {1, 2, 10, 3, 15, 1, 2, 2}));
        System.out.println(mercurialArray.isMercurial(new int[] {5, 2, 10, 3, 15, 1, 2, 2}));
        System.out.println(mercurialArray.isMercurial(new int[] {1, 2, 10, 3, 15, 16, 2, 2}));
        System.out.println(mercurialArray.isMercurial(new int[] {3, 2, 18, 1, 0, 3, -11, 1, 3}));
        System.out.println(mercurialArray.isMercurial(new int[] {2, 3, 1, 1, 18}));
        System.out.println(mercurialArray.isMercurial(new int[] {8, 2, 1, 1, 18, 3, 5}));
        System.out.println(mercurialArray.isMercurial(new int[] {3, 3, 3, 3, 3, 3}));
        System.out.println(mercurialArray.isMercurial(new int[] {1}));
        System.out.println(mercurialArray.isMercurial(new int[] {}));
    }

}
