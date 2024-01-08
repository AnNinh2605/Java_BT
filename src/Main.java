import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        confirmPassword();
    }
    public static void confirmPassword() {
        System.out.print("Enter your password: ");
        Scanner sc = new Scanner(System.in);
        String password=sc.nextLine();
        if (checkPassword(password)){
            System.out.println("Valid password");
        }
        else {
                System.out.print("Enter your password: ");
                password = sc.nextLine();
                confirmPassword();
        }
    }
    public static boolean checkPassword(String password) {
        if (password.length() >= 8 && checkLetter(password) && checkNumber(password) && checkSpecialDigit(password)){
            return true;
        }
        return false;
    }
    public static boolean checkLetter (String password) {
        for (char arr: password.toCharArray()){
            if (Character.isLetter(arr)){
            return true;
            }
        }
        return false;
    }
    public static boolean checkNumber (String password) {
        for (char arr: password.toCharArray()){
            if (Character.isDigit(arr)){
            return true;
            }
        }
        return false;
    }
    public static boolean checkSpecialDigit (String password) {
        String specialDigit = "!@#$%^&*()_+-=[]{};':\",.<>/?";
        for (char arr: password.toCharArray()) {
            if (specialDigit.contains(String.valueOf(arr))) {
                return true;
            }
        }
        return false;
    }

}

