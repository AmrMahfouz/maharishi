package previoustests;

public class PerfectSquare {

    public int nextPerfectSquare(int n) {
        if (n < 0) {
            return 0;
        }
        int sqrt = (int) Math.sqrt(n);
        n = sqrt + 1;
        return n * n;
    }

    public static void main(String[] args) {
        PerfectSquare perfectSquare = new PerfectSquare();
        System.out.println(perfectSquare.nextPerfectSquare(6));
        System.out.println(perfectSquare.nextPerfectSquare(36));
        System.out.println(perfectSquare.nextPerfectSquare(0));
        System.out.println(perfectSquare.nextPerfectSquare(-5));
    }

}
