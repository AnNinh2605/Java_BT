import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class Manage_room_booking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nameArrayList = new ArrayList<String>();
        ArrayList<String> checkInTimeArrayList = new ArrayList<String>();
        ArrayList<String> checkOutTimeArrayList = new ArrayList<String>();
        ArrayList<Integer> dayArrayList = new ArrayList<Integer>();
        ArrayList<Integer> monthArrayList = new ArrayList<Integer>();
        ArrayList<Integer> yearArrayList = new ArrayList<Integer>();

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

                // day month year input
                System.out.print("Day: ");
                int day = sc.nextInt();
                System.out.print("Month: ");
                int month = sc.nextInt();
                System.out.print("Year: ");
                int year = sc.nextInt();

                Calendar getdate = Calendar.getInstance();
                getdate.set(year, month - 1, day);

                int getYear = getdate.get(Calendar.YEAR);
                int getMonth = getdate.get(Calendar.MONTH) + 1;
                int getday = getdate.get(Calendar.DAY_OF_MONTH);
                dayArrayList.add(getday);
                monthArrayList.add(getMonth);
                yearArrayList.add(getYear);

                System.out.print("Check-in time: ");
                String checkInTime = new Scanner(System.in).nextLine();
                checkInTimeArrayList.add(checkInTime);

                System.out.print("Check-out time: ");
                String checkoutTime = new Scanner(System.in).nextLine();
                checkOutTimeArrayList.add(checkoutTime);
                System.out.println("Create successful");
            } else if (select == 2) {
                System.out.println("Display Booking List");
                for (int i = 0; i < nameArrayList.size(); i++) {
                    System.out.println("Name: " + nameArrayList.get(i) + "\n" +
                            "Booking day: " + dayArrayList.get(i) + "/" + monthArrayList.get(i) + "/" + yearArrayList.get(i)+"\n" +
                            "Check in time: " + checkInTimeArrayList.get(i) + "\n" +
                            "Check out time: " + checkOutTimeArrayList.get(i));
                }
            } else if (select == 3) {
                System.out.println("Calculate Minimum Number of Rooms Required");
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
