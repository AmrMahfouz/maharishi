package previoustests;

public class StantonMeasure {

    public int stantonMeasure(int[] a) {
        int numOfOnes = 0;
        for (int n : a) {
            if (n == 1) {
                numOfOnes++;
            }
        }
        int result = 0;
        for (int n : a) {
            if (n == numOfOnes) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        StantonMeasure stantonMeasure = new StantonMeasure();
        System.out.println(stantonMeasure.stantonMeasure(new int[] {1}));
        System.out.println(stantonMeasure.stantonMeasure(new int[] {0}));
        System.out.println(stantonMeasure.stantonMeasure(new int[] {3,1,1,4}));
        System.out.println(stantonMeasure.stantonMeasure(new int[] {1,3,1,1,3,3,2,3,3,3,4}));
        System.out.println(stantonMeasure.stantonMeasure(new int[] {}));
    }

}
