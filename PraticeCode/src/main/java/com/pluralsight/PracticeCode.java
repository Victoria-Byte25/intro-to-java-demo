package com.pluralsight;

import java.awt.*;
import java.util.Date;

public class PracticeCode {
    public static void main(String[] args) {
        sayHello();             //Method 1
        playWithPoints();       //Method 2
        sayGoodbye();           //Method 3
        printCurrentDate();     //Method 4
    }


    public static void sayHello() {
        System.out.println("Hello You");
    }
    public static void playWithPoints() {
        Point point1 = new Point(1, 1);
        Point point2= point1;
        point1.x = 2;
        System.out.println(point2);
    }

    public static void sayGoodbye() {
        System.out.println("Keep it moving mate!");
    }

    public static void printCurrentDate() {
        Date now = new Date();
        System.out.println( now);
    }







}
