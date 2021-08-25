package jayant;

import java.util.Scanner;

public class Largest_Num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num=1;
        int num2=0;
        int lar=0;
        while(num!=0){
            System.out.print("Enter Number:");
            num = input.nextInt();
            if(num>num2) lar = num;
            num2 = num;
        }
        System.out.print("Largest number is "+lar);

    }
}
