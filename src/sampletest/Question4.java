package sampletest;

public class Question4 {

    public int reverseInteger(int n) {
        int reverse = 0;
        while (n != 0) {
            int digit = n % 10;
            if (reverse == 0) {
                reverse = digit;
            } else {
                reverse = (reverse * 10) + digit;
            }
            n /= 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        Question4 question4 = new Question4();
        System.out.println(question4.reverseInteger(1234));
        System.out.println(question4.reverseInteger(12005));
        System.out.println(question4.reverseInteger(1));
        System.out.println(question4.reverseInteger(1000));
        System.out.println(question4.reverseInteger(0));
        System.out.println(question4.reverseInteger(-12345));
    }

}
