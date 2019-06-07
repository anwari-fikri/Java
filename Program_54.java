import java.util.Scanner;
import java.util.Random;

public class Program_54
{
  public static void main(String [] args)
  {
    Scanner input = new Scanner(System.in);
    Random r = new Random();
    
    int guess = 0;
    int num = 1 + r.nextInt(99);
    int counter = 0;
    
    System.out.println( "I'm thinking of a number between 1-100.  You have 7 guesses." );
    
    while ( guess != num && counter !=7 ){
      counter++;
      System.out.print( "Guess #" + counter + ": " ); guess = input.nextInt();
      if ( guess < num )
        System.out.println( "Too low" );
      else if ( guess > num )
        System.out.println( "Too high" );
      
    }
    if ( counter < 7 )
      System.out.println( "You guessed it!  What are the odds?!?" );
    else if ( counter >= 7 )
      System.out.println( "Sorry, you didn't guess it in 7 tries.  You lose." );
  }
}