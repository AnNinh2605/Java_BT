import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        while(true) {
            try {
                System.out.println("Enter: ");
                Scanner sc = new Scanner(System.in);
                int num = sc.nextInt();
                break;
            }
            catch (Exception e) {
                System.out.println("Loi");
            }
        }
    }
}
