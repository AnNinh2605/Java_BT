import java.util.Scanner;

public class GuessRandom {
    public static void playGame() {
        int guessNum = 1;
        int floor = 1;
        int ceiling = 100;
        boolean flag = false;

        int random = (int) (Math.random() * 100 + 1);
//        System.out.println("Random is: " +random);

        while (!flag) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your guess:  ");
            int guess = sc.nextInt();

            while ((guess < floor) || (guess > ceiling)) {
                System.out.print("Your guess must between " + floor + " and " + ceiling + ": " );
                guess = sc.nextInt();
            }

            if (random > guess) {
                if (guess > floor) {
                    floor = guess;
                }
                System.out.println("Your number is lower than the one I picked, It ranges between " + floor + " and " + ceiling);
            }

            else if (random < guess) {
                if (guess < ceiling) {
                    ceiling = guess;
                }
                System.out.println("Your number is higher than the number I picked, It ranges between " + floor + " and " + ceiling);
            }

            else {
                System.out.println("Correct! You guessed the number " + guess + " in " + guessNum + " tries.");
                flag = true;
            }
            guessNum++;
        }
    }

    public static void main(String[] args) {
        boolean flag = true;
        System.out.println("\n" +
                "Welcome to the Number Guessing Game!\n" +
                "I have selected a random number between 1 and 100.\n" +
                "Try to guess what it is!");
        while (flag) {
            playGame();
            Scanner sc = new Scanner(System.in);
            System.out.print("Do you want to play again? (yes/no): ");
            String nextPlay = sc.nextLine();
            flag = nextPlay.equals("yes");
        }
    }
}