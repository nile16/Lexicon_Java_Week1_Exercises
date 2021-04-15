import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {

        int a = getInteger();
        int b = getInteger();

        System.out.println(a + "+" + b + "=" + (a+b));
        System.out.println(a + "x" + b + "=" + (a*b));
        System.out.println(a + "/" + b + "=" + (a/b));
        System.out.println(a + "-" + b + "=" + (a-b));
    }

    public static String getStringFromUser() {
        Scanner scanner = new Scanner(System.in);
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
