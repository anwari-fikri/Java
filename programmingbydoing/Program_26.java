import java.util.Scanner;

public class Program_26
{
  public static void main(String [] args)
  {
    Scanner input = new Scanner(System.in);
    
    System.out.print( "Enter your current Earth weight: " );
    double weight_earth = input.nextDouble();
    
    System.out.println( "\nI have information for the following planets: " );
    System.out.println( "  1. Venus    2. Mars     3. Jupiter" );
    System.out.println( "  4. Saturn   5. Uranus   6. Neptune" );
    
    System.out.println( "\nWhich planet are you visiting?" );
    int planetNum = input.nextInt();
    
    double multiplier = 0;
    
    if ( planetNum == 1 )
      multiplier = 0.78;
    else if ( planetNum == 2 )
      multiplier = 0.39;
    else if ( planetNum == 2 )
      multiplier = 2.65;
    else if ( planetNum == 2 )
      multiplier = 1.17;
    else if ( planetNum == 2 )
      multiplier = 1.05;
    else if ( planetNum == 6 )
      multiplier = 1.23;
    else
      System.out.println( "error" );
    
    double weight = weight_earth * multiplier;
    
    System.out.printf( "\n\nYour weight would be %.2f pounds on that planet", weight );
    
  }
}