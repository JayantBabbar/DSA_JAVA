package jayant;
import java.util.Scanner;

public class Currency_Convert {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Rupees:");
    int num = input.nextInt();
    System.out.println(num+" rupees is "+ (num*0.013) +" dollar ");
    System.out.print("(taking 1 rupee = 0.013 dollars)");
    }

}
