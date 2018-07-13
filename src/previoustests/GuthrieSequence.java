package previoustests;

public class GuthrieSequence {

    public int isGuthrieSequence(int[] a) {
        if (a == null || a.length == 0) {
            return 0;
        }
        if (a[0] <= 0 || a[a.length -1] != 1) {
            return 0;
        }
        for (int i = 1; i < a.length; i++) {
            int nextGuthrieNumber = getNextGuthrieNumber(a[i - 1]);
            if (nextGuthrieNumber != a[i]) {
                return 0;
            }
        }
        return 1;
    }

    private int getNextGuthrieNumber(int n) {
        if (n % 2 == 0) {
            return n / 2;
        } else {
            return (n * 3) + 1;
        }
    }

    public static void main(String[] args) {
        GuthrieSequence guthrieSequence = new GuthrieSequence();
        System.out.println(guthrieSequence.isGuthrieSequence(new int[]{8, 4, 2, 1}));
        System.out.println(guthrieSequence.isGuthrieSequence(new int[]{8, 17, 4, 1}));
        System.out.println(guthrieSequence.isGuthrieSequence(new int[]{8, 4, 1}));
        System.out.println(guthrieSequence.isGuthrieSequence(new int[]{8, 4, 2}));
    }

}
