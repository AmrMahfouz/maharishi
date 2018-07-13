package previoustests;

public class NUpcount {

    public int nUpCount(int[] a, int n) {
        int partialSum = 0;
        int upcount = 0;
        for (int number : a) {
            int nextPartialSum = partialSum + number;
            if (nextPartialSum > partialSum && partialSum <= n && nextPartialSum > n) {
                upcount++;
            }
            partialSum = nextPartialSum;
        }
        return upcount;
    }

    public static void main(String[] args) {
        NUpcount nUpcount = new NUpcount();
        System.out.println(nUpcount.nUpCount(new int[]{2, 3, 1, -6, 8, -3, -1, 2}, 5));
        System.out.println(nUpcount.nUpCount(new int[]{6, 3, 1}, 6));
    }

}
