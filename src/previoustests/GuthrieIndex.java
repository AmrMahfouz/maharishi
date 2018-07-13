package previoustests;

public class GuthrieIndex {

    public int guthrieIndex(int n) {
        if (n < 0) {
            return 0;
        }
        int count = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = (n * 3) + 1;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        GuthrieIndex guthrieIndex = new GuthrieIndex();
        System.out.println(guthrieIndex.guthrieIndex(1));
        System.out.println(guthrieIndex.guthrieIndex(2));
        System.out.println(guthrieIndex.guthrieIndex(3));
        System.out.println(guthrieIndex.guthrieIndex(4));
        System.out.println(guthrieIndex.guthrieIndex(42));
    }

}
