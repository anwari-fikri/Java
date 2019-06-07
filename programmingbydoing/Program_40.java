import java.util.Scanner;

public class Program_40
{
  public static void main(String [] args)
  {
    Scanner keyboard = new Scanner(System.in);
    
    int num = 4;
    int guess;
    
    System.out.println("TEH WORST NUBMER GESSING GAME EVAR!!!!!!!1!");
    System.out.println("\nI'M THKING OF A NBR FROM 1-10.  TRY 2 GESS!");
    guess = keyboard.nextInt();
    System.out.println();
    
    if ( guess == num )
      System.out.println( "LOL!!! U GOT IT!  I CANT BELEIVE U GESSED IT WAS " + num + "!" );
    else 
      System.out.println( "W00T!  U SUX0R!!!  I PWN J00!!!  IT WAS " + num + "!" );
  }
}