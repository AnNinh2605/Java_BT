import java.util.Scanner;

public class GuessRandom {
    public static void playGame() {
        int guessNum = 1;
        int floor = 1;
        int ceiling = 100;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your guess:  ");
        int guess = sc.nextInt();

        while ((guess < 1) || (guess > 100)) {
            System.out.print("Your guess must between 1 and 100: ");
            guess = sc.nextInt();
        }
        int random = (int)(Math.random()*100 + 1);
//        System.out.println("Random is: " +random);

        while (random != guess) {
            if (random > guess) {
                floor = guess;
                System.out.println("Your number is lower than the one I picked, It ranges between " + floor + " and " + ceiling);
            }
            else{
                ceiling = guess;
                System.out.println("Your number is higher than the number I picked, It ranges between " + floor + " and " + ceiling);
            }
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            guessNum ++;
        }
        System.out.println("Correct! You guessed the number " + guess + " in " + guessNum + " tries.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n" +
                "Welcome to the Number Guessing Game!\n" +
                "I have selected a random number between 1 and 100.\n" +
                "Try to guess what it is!");

        playGame();
        System.out.print("Do you want to play again? (yes/no): ");
        String nextPlay = sc.nextLine();

        while (nextPlay.equals("yes")) {
            playGame();
            System.out.print("Do you want to play again? (yes/no): ");
            nextPlay =  sc.nextLine();
        }
    }
}