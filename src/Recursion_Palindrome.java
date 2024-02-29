import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Recursion_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int i = 0;
        while (true) {
            System.out.print("Num = ");
            num = sc.nextInt();
            if (num > 0) {
                break;
            }
        }
        System.out.println(Recursion(num, i));
    }

    // 12321 true, 99565 false
    //        public static boolean Recursion(int num) {
//        String[] strArr = Integer.toString(num).split("");
//        int length = strArr.length;
//        for (int i = 0; i < length / 2; i++) {
//            if (!Objects.equals(strArr[i], strArr[length - 1 - i])) {
//                return false;
//            }
//        }
//        return true;
//    }
    public static boolean Recursion(int num, int i) {
        String[] strArr = Integer.toString(num).split("");
        int length = strArr.length;
        if (i < length / 2) {
            if (!Objects.equals(strArr[i], strArr[length - 1 - i])) {
                return false;
            } else {
                Recursion(num, i + 1);
            }
        }
        return true;
    }
}
