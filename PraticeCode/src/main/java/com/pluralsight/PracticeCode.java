package com.pluralsight;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PracticeCode {
    public static void main(String[] args) {
        sayHello();             //Method 1
        playWithPoints();       //Method 2
        sayGoodbye();           //Method 3
        printCurrentDate();     //Method 4
        personalizedGreeting(); // Method 5
        playWithColoredPoint(); // Method 6
        printFormattedDate();   // Method 7
        int sum = addNumbers(3, 8);// Method 8
        System.out.println("The sum is:" + sum);
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

    public static void personalizedGreeting() {
        Scanner scanner = new Scanner (System.in);
        System.out.println("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "! Welcome to your nightmare!");
    }

    public static void playWithColoredPoint() {
        Point point = new Point(5, 10);
        Color color = Color.GREEN;
        System.out.println("Point is at (" + point.x + ", " + point.y + ") and it's " + color);
    }

    public static void printFormattedDate() {
        Date now = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE, MMMM d, yyyy 'at' hh:mm a");
        System.out.println("Formatted date: " + formatter.format(now));
    }

    public static byte addNumbers(int a, int b) {
        return 3 + 8;
    }







}
