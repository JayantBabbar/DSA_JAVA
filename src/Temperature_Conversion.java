import java.util.Scanner;

public class Temperature_Conversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Temperature in Celsius :");
        float tempC = input.nextFloat();
        float tempf = (tempC * 9/5) + 32;
        System.out.println(tempf);


    }
}
