package com.jayant;

import java.util.Scanner;

public class AreaIsosceles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the height of the isosceles triangle in cm ");
        double height = in.nextDouble();
        System.out.print("Enter the breadth of the isosceles triangle in cm ");
        double breadth = in.nextDouble();
        double area = height*breadth;
        System.out.print("The area of the isosceles triangle "+ area + " sq. cm");


    }

}
