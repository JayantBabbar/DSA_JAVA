package jayant;
import java.util.Scanner;

public class Greetings {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Name");
        String name = input.next();
        System.out.print("Hello "+name);

    }
}
