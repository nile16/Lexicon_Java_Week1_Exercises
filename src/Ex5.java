import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        String name = getStringFromUser("Enter your name: ");

        System.out.println("Hello " + name);
    }

    public static String getStringFromUser(String str) {
        System.out.print(str);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}
