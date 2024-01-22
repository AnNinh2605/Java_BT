import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Manage_room_booking {
    public static void main(String[] args) {
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nameArrayList = new ArrayList<String>();
        ArrayList<String> checkInTimeArrayList = new ArrayList<String>();
        ArrayList<String> checkOutTimeArrayList = new ArrayList<String>();

        while (!flag) {
            System.out.print(
                    "1: Booking room\n" +
                            "2: Booking list\n" +
                            "3: Calculate Minimum Number of Rooms Required\n" +
                            "4: Exit\n" +
                            "Select: ");
            int select = sc.nextInt();
            sc.nextLine();
            while (select < 1 || select > 4) {
                System.out.println("Choose 1 to Booking room, 2 to view Booking list, 3 to Calculate Minimum Number of Rooms Required, 4 to exit program) : ");
//                select = sc.nextLine();
                sc.nextLine();
            }
            if (select == 1) {
                System.out.print("Name: ");
                String name = sc.nextLine();
                nameArrayList.add(name);

                System.out.print("Check-in time: ");
                String checkInTime = sc.nextLine();
                checkInTimeArrayList.add(checkInTime);

                System.out.print("Check-out time: ");
                String checkoutTime = sc.nextLine();
                checkOutTimeArrayList.add(checkoutTime);
                System.out.println("Create successful");
            } else if (select == 2) {
                for (int i = 0; i < nameArrayList.size(); i++) {
                    System.out.println("Name: " + nameArrayList.get(i) + "\n" +
                            "Check in time " + checkInTimeArrayList.get(i) + "\n" +
                            "Check out time " + checkOutTimeArrayList.get(i));
                }
            } else if (select == 3) {
                System.out.println("Calculate Minimum Number of Rooms Required");
            } else {
                flag = true;
            }
        }
        ;
    }
}
