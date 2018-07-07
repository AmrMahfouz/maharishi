package sampletest;

public class Question2 {

    public int sum(int[] array) {

        int x = 0;
        int y = 0;

        for (int n : array) {
            if (n % 2 == 0) {
                y += n;
            } else {
                x += n;
            }
        }

        return x - y;

    }

    public static void main(String[] args) {
        Question2 question2 = new Question2();
        System.out.println(question2.sum(new int[]{1}));
        System.out.println(question2.sum(new int[]{1, 2}));
        System.out.println(question2.sum(new int[]{1, 2, 3}));
        System.out.println(question2.sum(new int[]{1, 2, 3, 4}));
        System.out.println(question2.sum(new int[]{3, 3, 4, 4}));
        System.out.println(question2.sum(new int[]{3, 2, 3, 4}));
        System.out.println(question2.sum(new int[]{4, 1, 2, 3}));
        System.out.println(question2.sum(new int[]{1, 1}));
        System.out.println(question2.sum(new int[]{}));
    }

}
