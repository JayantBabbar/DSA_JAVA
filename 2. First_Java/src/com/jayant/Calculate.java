package jayant;
import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number 1:");
        int num1 = input.nextInt();
        System.out.println("Enter Number 2:");
        int num2 = input.nextInt();
        System.out.println("Enter the Operation you want to do (+,*,/,-):");
        String op = input.next();

        if(op.equals("+")) {
            System.out.print( num1 +" + " + num2 + " = " + (num1 + num2));
        }
        if (op.equals("-")) {
            System.out.print( num1 +" - " + num2 + " = " + (num1 - num2));
        }
        if (op.equals("*")) {
            System.out.print( num1 +" * " + num2 + " = " + (num1 * num2));
        }
        if (op.equals("/")) {
            System.out.print( num1 +" / " + num2 + " = " + (num1 / num2));
        }






    }
}
