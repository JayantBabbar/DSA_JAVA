package com.jayant;

import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the height of the triangle in cm \t");
        double height = in.nextDouble();
        System.out.print("Enter the base of the triangle in cm \t");
        double base = in.nextDouble();
        double area = (base*height)/2;
        System.out.println("The Area of Triangle is : "+ area + " sq. cm");
    }
}

