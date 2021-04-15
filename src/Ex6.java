import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {

        int a = getInteger("Enter number 1: ");
        int b = getInteger("Enter number 2: ");

        System.out.println(a + "+" + b + "=" + (a+b));
        System.out.println(a + "x" + b + "=" + (a*b));
        System.out.println(a + "/" + b + "=" + (a/b));
        System.out.println(a + "-" + b + "=" + (a-b));
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
