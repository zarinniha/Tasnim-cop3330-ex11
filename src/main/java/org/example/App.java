/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Zarin Tasnim
 */

import java.util.Scanner;

class currencyConversion{

    public static void main(String args[])
    {
        System.out.print("How many euros are you exchanging? ");//reading the euros
        Scanner sc = new Scanner(System.in);
        int euro = sc.nextInt();

        System.out.print("What is the exchange rate? ");//reading the exchange rate
        double exchange_rate = sc.nextDouble();
        double dollar = euro * exchange_rate;

        System.out.print(euro+" euros at an exchange rate of "+exchange_rate+" is\n"+
                String.format("%.2f",dollar)+" U.S. dollars" );  //single output



    }
}