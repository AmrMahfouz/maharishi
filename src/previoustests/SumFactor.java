package previoustests;

public class SumFactor {

    public int sunFactor(int[] a) {
        int sum = 0;
        for (int n : a) {
            sum += n;
        }
        int sumCount = 0;
        for (int n : a) {
            if (n == sum) {
                sumCount++;
            }
        }
        return sumCount;
    }


    public static void main(String[] args) {
        SumFactor sumFactor = new SumFactor();
        System.out.println(sumFactor.sunFactor(new int[]{3, 0, 2, -5, 0}));
        System.out.println(sumFactor.sunFactor(new int[]{9, -3, -3, -1, -1}));
        System.out.println(sumFactor.sunFactor(new int[]{1}));
        System.out.println(sumFactor.sunFactor(new int[]{0, 0, 0}));
    }

}
