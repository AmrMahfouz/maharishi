package sampletest;

public class Question6 {

    public int poe(int[] array) {

        if (array == null || array.length <= 2) {
            return -1;
        }

        int sum = 0;
        for (int n : array) {
            sum += n;
        }

        int leftSum = array[0];
        int rightSum = sum - leftSum;
        for (int i = 1; i < array.length - 1; i++) {
            rightSum -= array[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += array[i];
        }

        return -1;

    }

    public static void main(String[] args) {
        Question6 question6 = new Question6();
        System.out.println(question6.poe(new int[]{1, 8, 3, 7, 10, 2}));
        System.out.println(question6.poe(new int[]{1, 5, 3, 1, 1, 1, 1, 1, 1}));
        System.out.println(question6.poe(new int[]{2, 1, 1, 1, 2, 1, 7}));
        System.out.println(question6.poe(new int[]{1, 2, 3}));
        System.out.println(question6.poe(new int[]{3, 4, 5, 10}));
        System.out.println(question6.poe(new int[]{1, 2, 10, 3, 4}));
    }

}
