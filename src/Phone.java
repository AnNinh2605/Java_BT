import java.util.ArrayList;
import java.util.Scanner;

public class Phone {
    // validate name
    static boolean checkName(String name) {
        for (char charName : name.toCharArray()) {
            if (!Character.isLetter(charName)) {
                return false;
            }
        }
        return true;
    }

    //validate phone number
    public static void main(String[] args) {
        boolean flag = false;
        Scanner sc = new Scanner((System.in));
        ArrayList<String> nameArrayList = new ArrayList<String>();
        ArrayList<Integer> phoneArrayList = new ArrayList<Integer>();

        while (!flag) {
            System.out.print("==================================\n" +
                    "WELCOME TO CONTACT MANAGEMENT\n" +
                    "==================================\n" +
                    "1. Create Contact\n" +
                    "2. View Contact\n" +
                    "3. Exit\n" +
                    "(Choose 1 to create contact, 2 to view contact, 3 to exit program) : ");

            int select = sc.nextInt();
            sc.nextLine();
            while (select < 1 || select > 3) {
                System.out.println("Choose 1 to create contact, 2 to view contact, 3 to exit program) : ");
                select = sc.nextInt();
                sc.nextLine();
            }
            if (select == 1) {
                System.out.print("Name : ");
                String name = sc.nextLine();
                while (!checkName(name)) {
                    System.out.print("Name contains only letters: ");
                    name = sc.nextLine();
                }
                nameArrayList.add(name);

                int phoneNumber = 0;
                while (true) {
                    try {
                        System.out.print("Phone number: ");
                        phoneNumber = Integer.parseInt(sc.nextLine());
                        break;
                    } catch (Exception e) {
                        System.out.println("Phone number must be a number: ");
                    }
                }
                for (int i = 0; i < phoneArrayList.size(); i++) {
                    if (phoneArrayList.get(i) == phoneArrayList.get(i + 1)) {
                        System.out.println("The phone number is existing");
                    } else {
                        phoneArrayList.add(phoneNumber);
                    }
                }

                System.out.println("Created sucessful");
            } else if (select == 2) {
                for (int index = 0; index < nameArrayList.size(); index++) {
                    System.out.println("Name: " + nameArrayList.get(index) + "\n" +
                            "Phone number: " + phoneArrayList.get(index));
                }
                sc.nextLine();
            } else {
                flag = true;
            }
            System.out.print("\n");
        }
    }
}

