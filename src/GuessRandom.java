import java.util.Scanner;

public class GuessRandom {
    public static void playGame() {
        int guessNum = 1;
        int floor = 1;
        int ceiling = 100;

        Scanner sc = new Scanner(System.in);
        System.out.print("Your guess: ");
        int guess = sc.nextInt();

        while ((guess < 1) || (guess > 100)) {
            System.out.print("Your guess must between 1 and 100: ");
            guess = sc.nextInt();
        }
        int random = (int)(Math.random()*100 + 1);
        System.out.println("Random is: " +random);

        while (random != guess) {
            if (random > guess) {
                System.out.println("Your number is lower than the one I picked, It ranges between " + guess+ " and " + ceiling);
                floor = guess;
            }
            else{
                System.out.println("Your number is higher than the number I picked, It ranges between " + floor + " and " + guess);
            }
            System.out.print("Your guess: ");
            guess = sc.nextInt();
            guessNum ++;
        }
        System.out.println("Correct! You guessed the number " + guess + " in " + guessNum + " tries.");
    }
    public static void main(String[] args) {
        playGame();
        System.out.println("Do you want to play again? (yes/no): yes");
        Scanner sc = new Scanner(System.in);
        String nextPlay = sc.nextLine();
        if (nextPlay.equals("yes")) {
            playGame();
        }
        else {
            System.out.println("See you");
        }
    }
}
// chưa set được floor và ceiling hiện khoảng cần đoán  tiếp theo