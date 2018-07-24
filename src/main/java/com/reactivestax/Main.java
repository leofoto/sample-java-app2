package com.reactivestax;

import com.reactivestax.domain.IShape;
import com.reactivestax.domain.Rectangle;
import com.reactivestax.domain.Square;

public class Main {

    public static void main(String[] args) {
        final String programName = "SampleProgram";

//        programName = "hello";

        IShape firstRectangle = new Rectangle();
        ((Rectangle) firstRectangle).setLength(10);
        ((Rectangle) firstRectangle).setWidth(20);
        System.out.println("firstRectangle area= " + firstRectangle.calculateArea());
        ((Rectangle) firstRectangle).setArea(firstRectangle.calculateArea());

        IShape square = new Square();
        ((Square) square).setSideLength(10);
        System.out.println("square = " + square.calculateArea());

        if (firstRectangle instanceof Rectangle) {
            System.out.println("firstRectangle is instance of Rectangle with area =" + ((Rectangle) firstRectangle).getArea());
        }
        if (firstRectangle instanceof Square) {
            System.out.println("firstRectangle is instance of Square" + ((Square) firstRectangle).getArea());
        }

        IShape secondRectangle = new Rectangle();
        System.out.println("secondRectangle area= " + ((Rectangle) secondRectangle).getArea());


    }
}
