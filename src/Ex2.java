import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        int year = getInteger("Enter a year: ");

        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    public static String getStringFromUser(String prompt) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static boolean isLeapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
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
