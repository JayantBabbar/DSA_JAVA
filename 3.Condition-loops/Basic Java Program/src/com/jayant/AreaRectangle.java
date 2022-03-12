package com.jayant;

import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Length of the rectangle in cm ");
        double length = in.nextDouble();
        System.out.print("Enter the breadth of the rectangle in cm ");
        double breadth = in.nextDouble();
        double area = length*breadth;
        System.out.print("The area of the rectangle "+ area + " sq. cm");


    }
}
