package oop.example;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Kate Ingraham
 */
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

        Scanner input = new Scanner(System.in);
        System.out.println("What is the quote? ");
        String userQuote = input.nextLine();

        System.out.println("Who said it? ");
        String userAuthor = input.nextLine();

        System.out.println("What is the quote? " + userQuote +
                "\nWho said it? " + userAuthor +
                "\n" + userAuthor + " says, \"" + userQuote + "\"\n");


    }
}
