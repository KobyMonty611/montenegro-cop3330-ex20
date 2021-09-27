/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Koby Montenegro
 */

import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the order amount? ");
        double order = scan.nextDouble();
        double tax = 0;

        System.out.print("What state do you live in? ");
        String state = scan.nextLine();
        state = scan.nextLine();

        if(state.equals("Wisconsin"))
        {
            tax = order*0.05;
            System.out.print("What county do you live in? ");
            String county = scan.nextLine();

            if(county.equals("Eau Claire"))
            {
                tax = tax + order*0.005;
            }
            else if(county.equals("Dunn"))
            {
                tax = tax + order*0.004;
            }
        }

        if(state.equals("Illinois"))
        {
            tax = order*0.08;
        }

        String output = String.format("The tax is $%.2f.\nThe total is $%.2f.", tax, order+tax);

        System.out.print(output);
        scan.close();

    }
}