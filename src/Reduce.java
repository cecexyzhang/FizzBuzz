public class Reduce {
    public static void main(String[] args) {
        int count = 0;

        int i = 100;
        while (i > 0) {

            // Find out which numbers are even and odd.
            boolean isEven = i % 2 == 0;
            boolean isOdd = i % 2 == 1;

            // Print our appropriate result.
            if (isEven) {
                i = i / 2;
                count++;
            } else if (isOdd) {
                i = i - 1;
                count++;
            }
        }
        System.out.println(count);
    }
}
