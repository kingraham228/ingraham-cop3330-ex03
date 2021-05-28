package oop.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

        Scanner input = new Scanner(System.in).useDelimiter("\\n");
        System.out.println("What is the quote? ");
        String userQuote = input.next();

        System.out.println("Who said it? ");
        String userAuthor = input.next();

        System.out.println(userAuthor+" says, \""+userQuote+"\"");


    }
}
