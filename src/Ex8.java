import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Ex8 {

    public static void main(String[] args) {
        int numberToGuess = ThreadLocalRandom.current().nextInt(0, 100);

        System.out.println("Guess a number from 0 to 100.");
        do {
            int userGuess = getInteger("Your guess: ");

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

    public static String getStringFromUser(String prompt) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static int getInteger(String prompt) {
        while(true) {
            try {
                return Integer.parseInt(getStringFromUser(prompt).trim());
            } catch(NumberFormatException e) {
                System.out.println("Input was not an integer");
            }
        }
    }
}
