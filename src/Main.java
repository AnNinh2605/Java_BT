import java.util.Scanner;
// check password
// dai hon 8 ki tu
// co chu
// co so
// co ki tu dac biet//
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password;
        do {
            System.out.print("Enter your password: ");
            password = sc.nextLine();
        }
        while (!(password.length() > 8 && checkLetter(password) && checkNumber(password)));
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
}

