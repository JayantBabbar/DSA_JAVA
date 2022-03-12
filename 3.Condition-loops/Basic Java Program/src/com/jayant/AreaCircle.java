package com.jayant;

import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the radius of the circle in cm \t");
        double rad = in.nextDouble();
        double area = 3.14*rad*rad;
        System.out.println("The Area of Circle is : "+ area + " sq. cm");

    }
}
