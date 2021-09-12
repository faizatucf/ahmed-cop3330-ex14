/*
 *  UCF COP3330 Fall 2021 Assignment 14 Solution
 *  Copyright 2021 Faiz Ahmed
 */

import java.util.*;
public class taxcalc {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int amount; 
        String state, output = "";
        double subtotal, tax, total;
        System.out.println("What is the order amount?");
        amount = sc.nextInt();
        sc.nextLine();
        System.out.println("What is the state?");
        state = sc.nextLine();
        subtotal = amount;
        tax = (5.5/100) * subtotal;
        total = subtotal +(tax);
        if(state.equals("WI"))
        output = String.format("\nThe tax is $%.2f.\nThe total is $%.2f.",tax,total);
        System.out.println(String.format("The total is $%.2f.", subtotal)+output);
    }
}