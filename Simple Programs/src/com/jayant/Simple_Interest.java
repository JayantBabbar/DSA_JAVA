package jayant;
import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Principle Amount:");
        int p = input.nextInt();
        System.out.println("Enter the Time Period:");
        int t = input.nextInt();
        System.out.println("Enter the Rate of Interest:");
        int r = input.nextInt();
        int s = (p*r*t)/100; //Formula of Simple Interest
        System.out.print("Simple Interest of given data is: "+s);

    }
}
