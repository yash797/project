import java.io.*;

import java.util.*;

class Rect

{

    double width, length, area;

    String color;

    Scanner sc = new Scanner(System.in);

    Rect()

    {

        System.out.print("Enter the length: ");

        length = sc.nextDouble();

        System.out.print("Enter the width: ");

        width = sc.nextDouble();

        System.out.print("Enter the color: ");

        color = sc.next();

        area = length * width;

        System.out.println("Area of Rectangle: " + area);

    }

}

class matching_rect

{

    public static void main(String arg[])

    {

        System.out.println("First Rectangle: ");

        Rect r1 = new Rect();

        System.out.println("Second Rectangle: ");

        Rect r2 = new Rect();

        if (r1.area == r2.area && r1.color.equals(r2.color))

            System.out.println("Matching Rectangle ");

        else

            System.out.println("Non Matching Rectangle ");

    }

}