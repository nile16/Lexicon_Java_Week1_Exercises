import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Ex8 {

    public static void main(String[] args) {
        int numberToGuess = ThreadLocalRandom.current().nextInt(0, 100);

        System.out.println("Guess a number from 0 to 100.");
        do {
            int userGuess = getInteger();

            if (userGuess == numberToGuess) {
                System.out.println("Correct!");
                break;
            }
            if (userGuess > numberToGuess) {
                System.out.println("Too big");
            } else {
                System.out.println("Too small");
            }
        } while(true);
    }

    public static String getStringFromUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.print(">");
        return scanner.nextLine();
    }

    public static int getInteger() {
        while(true) {
            try {
                return Integer.parseInt(getStringFromUser().trim());
            } catch(NumberFormatException e) {
                System.out.println("Input was not an integer");
            }
        }
    }
}
