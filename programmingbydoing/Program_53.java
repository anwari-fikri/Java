import java.util.Scanner;
import java.util.Random;

public class Program_53
{
  public static void main(String [] args)
  {
    Scanner keyboard = new Scanner(System.in);
    Random r = new Random();
    
    int guess;
    
    int num = 1 + r.nextInt(9);
    int tries = 1;
    
    System.out.println("I'm thinking of a number from 1 to 10.");
    guess = keyboard.nextInt();
    
    while ( guess != num ){
      System.out.println( "That is incorrect. Guess again." );
      guess = keyboard.nextInt();
      tries++;
    }
      System.out.println( "That's right!  My secret number was " + num + "!" );
      System.out.println( "It only took you " + tries + " tries." );
  }
}