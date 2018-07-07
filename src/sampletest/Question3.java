package sampletest;

public class Question3 {

    public char[] getChars(char[] chars, int start, int len) {

        if (chars == null) {
            return null;
        }

        //check start and length
        boolean invalidStart = start < 0;
        boolean invalidLen = len < 0 || (start + len - 1) >= chars.length;

        if (invalidStart || invalidLen) {
            return null;
        }

        char[] result = new char[len];
        int index = 0;

        for(int i = start; index < len; i++) {
            result[index++] = chars[i];
        }

        return result;

    }

    public void print(char[] chars) {
        if (chars == null) {
            System.out.println("null");
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{");
        for (char c : chars) {
            stringBuilder.append(c + ",");
        }
        if (chars.length > 0) {
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
        stringBuilder.append("}");
        System.out.println(stringBuilder.toString());
    }

    public static void main(String[] args) {
        Question3 question3 = new Question3();
        char[] chars = {'a', 'b', 'c'};
        question3.print(question3.getChars(chars, 0, 4));
        question3.print(question3.getChars(chars, 0, 3));
        question3.print(question3.getChars(chars, 0, 2));
        question3.print(question3.getChars(chars, 0, 1));
        question3.print(question3.getChars(chars, 1, 3));
        question3.print(question3.getChars(chars, 1, 2));
        question3.print(question3.getChars(chars, 1, 1));
        question3.print(question3.getChars(chars, 2, 2));
        question3.print(question3.getChars(chars, 2, 1));
        question3.print(question3.getChars(chars, 3, 1));
        question3.print(question3.getChars(chars, 1, 0));
        question3.print(question3.getChars(chars, -1, 2));
        question3.print(question3.getChars(chars, -1, -2));
        question3.print(question3.getChars(new char[] {}, 0, 1));
    }

}
