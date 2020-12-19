import java.util.Scanner;

public class guessNumber {
    public static void main(String[] args) {
       int number = 5;
       Scanner scan = new Scanner(System.in);

        for (int i=0; i<3; i++) {
            System.out.println("Guess a number : ");
            int quessNum = scan.nextInt();
            if (quessNum == number) {
                System.out.println("You guessed right");
                break;
            }
            System.out.println("You guessed wrong");

        }
    }
}
