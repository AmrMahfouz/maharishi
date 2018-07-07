package sampletest;

public class Question1 {

    public int centered(int[] array) {

        //check size if odd there is a middle element if even return false

        if (array.length % 2 == 0) {
            return 0;
        }

        int middleIndex = (array.length / 2);
        int middleElement = array[middleIndex];

        for (int i = 0; i < array.length; i++) {
            if (i != middleIndex && middleElement >= array[i]) {
                return 0;
            }
        }

        return 1;

    }

    public static void main(String[] args) {
        Question1 question1 = new Question1();
        System.out.println(question1.centered(new int[]{1, 2, 3, 4, 5}));
        System.out.println(question1.centered(new int[]{3, 2, 1, 4, 5}));
        System.out.println(question1.centered(new int[]{3, 2, 1, 4, 1}));
        System.out.println(question1.centered(new int[]{}));
        System.out.println(question1.centered(new int[]{10}));
    }

}
