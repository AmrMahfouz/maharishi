package previoustests;

public class Solve10 {

    public int[] solve10() {
        int tenFactorial = 1;
        for (int i = 10; i > 0; i--) {
            tenFactorial *= i;
        }
        int[] factorials = new int[10];
        int factorial = 1;
        for (int i = 1; i < factorials.length; i++) {
            factorial *= i;
            factorials[i] = factorial;
        }
        int[] result = new int[2];
        int start = 0;
        int end = factorials.length - 1;
        while (start < end) {
            int sum = factorials[start] + factorials[end];
            if (sum == tenFactorial) {
                result[0] = start;
                result[1] = end;
            } else if (sum > tenFactorial) {
                end--;
            } else if (sum < tenFactorial) {
                start++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solve10 solve10 = new Solve10();
        int[] result = solve10.solve10();
        System.out.println(result[0] + "   " + result[1]);
    }

}
