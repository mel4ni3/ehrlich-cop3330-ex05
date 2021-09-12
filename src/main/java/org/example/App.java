/*
 *  UCF COP3330 Fall 2021 Assignment 5 Solution
 *  Copyright 2021 Melanie Ehrlich
 */

package org.example;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int plus, minus, times, divide;

        System.out.print("What is the first number? ");
        String str = s.nextLine();
        int num = Integer.valueOf(str);

        if (num < 0) {
            System.out.print("Enter a positive number, try again.");
            num = s.nextInt();
        }

        System.out.print("What is the second number? ");
        String strtwo = s.nextLine();
        int numtwo = Integer.valueOf(strtwo);

        if (numtwo < 0) {
            System.out.print("You must enter a positive number.");
            numtwo = Integer.valueOf(numtwo);
        }

        plus = num + numtwo;
        minus = num - numtwo;
        times  = num * numtwo;
        divide = num / numtwo;

        System.out.print(num + " + " + numtwo + " = " + plus + "\n" + num + " - " + numtwo + " = " + minus + "\n" + num + " * " + numtwo + " = " + times + "\n" + num + " / " + numtwo + " = " + divide);
    }
}