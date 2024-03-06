public class test {
    public static void printDiamond(int n) {
        if (n < 1) {
            System.out.println("Input should be a positive integer");
            return;
        }

        // Create an array of characters from 'a' to 'e'
        char[] chars = new char[n];
        for (int i = 0; i < n; i++) {
            chars[i] = (char)('a' + i);
        }

        // Print upper half of the diamond
        for (int i = n - 1; i >= 0; i--) {
            System.out.print("-".repeat(2 * i));
            for (int j = n - 1; j >= n - i - 1; j--) {
                System.out.print(chars[j] + "-");
            }
            System.out.println();
        }

        // Print lower half of the diamond
        for (int i = 1; i < n; i++) {
            System.out.print("-".repeat(2 * i));
            for (int j = n - 1; j >= n - i - 1; j--) {
                System.out.print(chars[j] + "-");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Sample Output 1:");
        printDiamond(5);
        System.out.println("\nSample Output 2:");
        printDiamond(3);
    }
}
