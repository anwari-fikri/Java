import java.util.Scanner;
import java.util.Random;

public class Program_43
{
  public static void main(String [] args)
  {
    Scanner keyboard = new Scanner(System.in);
    Random r = new Random();
    
    int num = 1 + r.nextInt(9);
    int guess;
    
    System.out.println("I'm thinking of a number from 1 to 10.");
    guess = keyboard.nextInt();
    System.out.println();
    
    if ( guess == num )
      System.out.println( "That's right!  My secret number was " + num + "!" );
    else 
      System.out.println( "Sorry, but I was really thinking of " + num + "." );
  }
}