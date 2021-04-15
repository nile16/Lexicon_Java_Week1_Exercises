import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        int year = getInteger();

        if (isLeapYear(year)) {
            System.out.println("Is a leap year.");
        } else {
            System.out.println("Is not a leap year.");
        }
    }

    public static String getStringFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static boolean isLeapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
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
