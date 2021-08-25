package jayant;
import java.util.Scanner;

public class Largest_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number 1:");
        int num1 = input.nextInt();
        System.out.println("Enter Number 2:");
        int num2 = input.nextInt();

        if (num1>num2) System.out.print("Largest Number is " + num1);
        if (num1<num2) System.out.print("Largest Number is " + num2);
        else System.out.print("Both are equal");
    }

    }
