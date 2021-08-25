package jayant;
import java.util.Scanner;

public class SumofNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num=1;
        int sum=0;
        while(num!=0){
        System.out.print("Enter Number:");
        num = input.nextInt();
        sum+= num;
        }
        System.out.print("Sum of numbers is "+sum);

    }
}
