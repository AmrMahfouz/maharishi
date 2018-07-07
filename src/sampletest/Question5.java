package sampletest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question5 {

    public int[] commonElements(int[] first, int[] second) {

        if (first == null || second == null) {
            return null;
        }

        Set<Integer> elements = new HashSet<>();
        for (int n : second) {
            elements.add(n);
        }
        List<Integer> commonList = new ArrayList<>();
        for (int n : first) {
            if (elements.contains(n)) {
                commonList.add(n);
            }
        }
        int[] result = new int[commonList.size()];
        int index = 0;
        for (int n : commonList) {
            result[index++] = n;
        }
        return result;
    }

    public void print(int[] array) {
        if (array == null) {
            System.out.println("null");
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{");
        for (int n : array) {
            stringBuilder.append(n + ",");
        }
        if (array.length > 0) {
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
        stringBuilder.append("}");
        System.out.println(stringBuilder.toString());
    }

    public static void main(String[] args) {
        Question5 question5 = new Question5();
        question5.print(question5.commonElements(new int[] {1,8,3,2}, new int[] {4,2,6,1}));
        question5.print(question5.commonElements(new int[] {1,8,3,2,6}, new int[] {2,6,1}));
        question5.print(question5.commonElements(new int[] {1,3,7,9}, new int[] {7,1,9,3}));
        question5.print(question5.commonElements(new int[] {1,2}, new int[] {3,4}));
        question5.print(question5.commonElements(new int[] {}, new int[] {1,2,3}));
        question5.print(question5.commonElements(new int[] {1,2}, new int[] {}));
        question5.print(question5.commonElements(new int[] {1,2}, null));
        question5.print(question5.commonElements(null, new int[] {}));
        question5.print(question5.commonElements(null, null));
    }

}
