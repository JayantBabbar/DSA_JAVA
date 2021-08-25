package jayant;
import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = input.nextInt();
        int count = 1;
        while (count <= num){
            if(num%count==0){
                System.out.println(count);
            }
            count++;
        }

    }

}
