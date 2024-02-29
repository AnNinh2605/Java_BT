import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class Manage_room_booking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nameArrayList = new ArrayList<String>();
        ArrayList<Integer> checkInTimeArrayList = new ArrayList<Integer>();
        ArrayList<Integer> checkOutTimeArrayList = new ArrayList<Integer>();

        while (true) {
            System.out.print(
                    "\n1: Booking room\n" +
                            "2: Booking list\n" +
                            "3: Calculate Minimum Number of Rooms Required\n" +
                            "4: Exit\n" +
                            "Select: ");
            int select = sc.nextInt();
            sc.nextLine();
            while (select < 1 || select > 4) {
                System.out.println("Choose 1 to Booking room, 2 to view Booking list, 3 to Calculate Minimum Number of Rooms Required, 4 to exit program) : ");
                System.out.print("Select: ");
                select = sc.nextInt();
                sc.nextLine();
            }
            if (select == 1) {
                System.out.println("Your selected Room Booking");
                String name;
                while (true) {
                    System.out.print("Name: ");
                    name = sc.nextLine();
                    if (checkName(name)) {
                        nameArrayList.add(name);
                        break;
                    } else {
                        System.out.println("Name only letters");
                    }
                }

                System.out.print("Check-in time: ");
                Integer checkInTime = new Scanner(System.in).nextInt();
                checkInTimeArrayList.add(checkInTime);

                System.out.print("Check-out time: ");
                Integer checkoutTime = new Scanner(System.in).nextInt();
                checkOutTimeArrayList.add(checkoutTime);
                System.out.printf("Mr/Ms %s Booking successful: %sh to %sh ", name, checkInTime, checkoutTime);
            } else if (select == 2) {
                System.out.println("Display Booking List");
                for (int i = 0; i < nameArrayList.size(); i++) {
                    System.out.printf("Mr/Ms %s Booking from %sh to %sh \n", nameArrayList.get(i), checkInTimeArrayList.get(i), checkOutTimeArrayList.get(i));
                }
            } else if (select == 3) {
                int countRoom = 1;
                System.out.println("Calculate Minimum Number of Rooms Required");
                for (int i = 1; i < checkInTimeArrayList.size(); i++) {
                    if (checkOutTimeArrayList.getFirst() > checkInTimeArrayList.get(i)) {
                        countRoom ++;
                    }
                }
                System.out.println("Room request: " + countRoom);
            } else {
                System.out.println("Exit program");
                break;
            }
        }
        ;
    }

    //check name only letter
    public static boolean checkName(String name) {
        for (char check : name.toCharArray()) {
            if (!Character.isLetter(check)) {
                return false;
            }
        }
        return true;
    }


}
