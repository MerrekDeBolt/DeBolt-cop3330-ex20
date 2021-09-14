package org.example;

/*
 *  UCF COP3330 Fall 2021 Exercise 17 Solution
 *  Copyright 2021 Merrek DeBolt
 */

import java.util.Scanner;

public class App {

    public static void main(String[] args)
    {
        int orderAmount;
        String state, county;
        double taxRate = 0, totalTax, total;

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the order amount? ");
        orderAmount = scanner.nextInt();

        System.out.println("What state do you live in? ");
        scanner = new Scanner(System.in);
        state = scanner.nextLine();

        System.out.println("What county do you live in? ");
        county = scanner.nextLine();

        if (state.equals("Wisconsin"))
        {
            taxRate = 0.05;
            if (county.equals("Eau Claire"))
                taxRate += 0.005;
            else if (county.equals("Dunn"))
                taxRate += 0.004;
        }
        else if (state.equals("Illinois"))
            taxRate = 0.08;

        totalTax = orderAmount * taxRate;
        total = orderAmount + totalTax;

        System.out.println(String.format("The tax is $%.2f.\nThe total is $%.2f.", totalTax, total));
    }
}