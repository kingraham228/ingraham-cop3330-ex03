package oop.example;
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

        System.out.printf("What is the quote? %s%nWho said it? %s%n%s says, \"%s\"%n",
                userQuote, userAuthor, userAuthor, userQuote);


    }
}
