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

    // validate phone number
    static boolean validatePhoneNumber(String phoneNumber) {
        for (char num : phoneNumber.toCharArray()) {
            if (!Character.isDigit(num)) {
                return false;
            }
        }
        return true;
    }

    //check existing phone number
    static boolean checkPhoneNumber(String phoneNumber, ArrayList phoneArrayList) {
        if (!phoneArrayList.isEmpty()) {
            for (Object o : phoneArrayList) {
                if (o.equals(phoneNumber)) {
                    return true;
                }
            }
        }
        return false;
    }

    //delete phone number
    static boolean deletePhoneNumber(String deleteName, ArrayList nameArrayList) {
        for (Object name : nameArrayList) {
            if (deleteName.equals(name)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        boolean flag = false;
        Scanner sc = new Scanner((System.in));
        ArrayList<String> nameArrayList = new ArrayList<String>();
        ArrayList<String> phoneArrayList = new ArrayList<String>();

        while (!flag) {
            System.out.print("\n==================================\n" +
                    "WELCOME TO CONTACT MANAGEMENT\n" +
                    "==================================\n" +
                    "1. Create Contact\n" +
                    "2. View Contact\n" +
                    "3. Delete Contact\n" +
                    "4. Exit\n" +
                    "Choose 1 to create contact, 2 to view contact, 3 to delete contact, 4 to exit program : ");

            int select = Integer.parseInt(sc.nextLine());
            while (select < 1 || select > 4) {
                System.out.println("Choose 1 to create contact, 2 to view contact, 3 to delete contact, 4  to exit program : ");
                select = sc.nextInt();
                sc.nextLine();
            }

            if (select == 1) {
                System.out.print("Name : ");
                String name = sc.nextLine();
                //validate name
                while(!checkName(name)){
                    System.out.println("Name only letter: ");
                    name = sc.nextLine();
                };
                //validate phone number
                System.out.print("Phone number : ");
                String phoneNumber = sc.nextLine();

                while (!validatePhoneNumber(phoneNumber)) {
                    System.out.println("Phone number must contain digits");
                    System.out.print("Phone number : ");
                    phoneNumber = sc.nextLine();
                }
                char[] num = phoneNumber.toCharArray();
                while ((phoneNumber.length() != 10) || (num[0] != '0')) {
                    System.out.println("Phone number must have 10 numbers and start with 0");
                    System.out.print("Phone number : ");

                    phoneNumber = sc.nextLine();
                    num = phoneNumber.toCharArray();
                }
                //check existing phone number
                if (checkPhoneNumber(phoneNumber, phoneArrayList)) {
                    System.out.println("Phone number " + phoneNumber + " is exist");
                    sc.nextLine();
                } else {
                    System.out.println("Created successful");
                    phoneArrayList.add(phoneNumber);
                    nameArrayList.add(name);
                    sc.nextLine();
                }
            } else if (select == 2) {
                for (int i = 0; i < nameArrayList.size(); i++) {
                    System.out.println("Name: " + nameArrayList.get(i));
                    System.out.println("Phone: " + phoneArrayList.get(i));
                }
                sc.nextLine();
            } else if (select == 3) {
                System.out.print("Delete phone name: ");
                String deleteName = sc.nextLine();
                if (deletePhoneNumber(deleteName, nameArrayList)) {
                    int indexDelete = nameArrayList.indexOf(deleteName);
                    System.out.println("Deleted name: " + deleteName + " phone: " + phoneArrayList.get(indexDelete) + " Successful");
                    nameArrayList.remove(deleteName);
                    phoneArrayList.remove(indexDelete);
                } else {
                    System.out.println("Name is not exist");
                }
            } else {
                flag = true;
            }
        }
    }
}

// confirm validate name
// chưa xữ lí trường hợp select không phải 1234
