import java.util.Arrays;

public class Justify_test {
    public static void main(String[] args) {
//        String[] arr = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
//        int k = 16;
//        int space = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            space = space + arr[i].length() + 1; // vong dau tien cong 1 chua dung
//            if (space > k) {
//                space = arr[i].length();
//                System.out.println("\n");
//            }
//            System.out.printf("%.10s", arr[i] + " ");
//        }
        String[] arr1 = {"the", "quick", "brown"};
        String[] arr2 = {"fox", "jumps", "over"};
        String[] arr3 = {"the", "lazy", "dog"};

        System.out.printf("/s", arr1[0], arr1[1], arr1[2]);

    }
}

