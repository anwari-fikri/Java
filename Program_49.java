import java.util.Scanner;
import java.util.Random;

public class Program_49
{
  public static void main(String [] args)
  {
    Scanner keyboard = new Scanner(System.in);
    Random r = new Random();
    
    int num = 1 + r.nextInt(9);
    int guess;
    
    System.out.println("I'm thinking of a number from 1 to 10.");
    guess = keyboard.nextInt();
    
    while ( guess != num ){
      System.out.println( "That is incorrect. Guess again." );
      guess = keyboard.nextInt();
    }
      System.out.println( "That's right!  My secret number was " + num + "!" );
      
  }
}