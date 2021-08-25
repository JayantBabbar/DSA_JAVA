package jayant;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number of which you want to find the Factorial :");
        int num= input.nextInt();
        int n = num ;
        int fact = 1;
        if (num<0) {
            System.out.println("Enter a Positive Number");
        }
        else{
        while(num >1){
            fact*= num;
            num--;
        }
        System.out.println("Factorial of "+n+" is "+fact);
        }
    }
}
