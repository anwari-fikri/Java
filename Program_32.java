import java.util.Scanner;

public class Program_32
{
  public static void main(String [] args)
  {
    Scanner input = new Scanner(System.in);
    
    System.out.println( "TWO QUESTIONS!" );
    System.out.println( "Think of an object, and I'll try to guess it." );
    
    System.out.println( "\nQuestion 1) Is it animal, vegetable, or mineral?" );
    String type = input.next();
    
    System.out.println( "\nQuestion 2) Is it bigger than a breadbox?" );
    String size = input.next();
    
    String output = "";
    
    if ( type.equals( "animal" ) && size.equals( "no" ) )
      output = "squirrel";
    if ( type.equals( "animal" ) && size.equals( "yes" ) )
      output = "moose";
    if ( type.equals( "vegetable" ) && size.equals( "no" ) )
      output = "carrot";
    if ( type.equals( "vegetable" ) && size.equals( "yes" ) )
      output = "watermelon";
    if ( type.equals( "mineral" ) && size.equals( "no" ) )
      output = "paper clip";
    if ( type.equals( "mineral" ) && size.equals( "yes" ) )
      output = "Camaro";
    
    System.out.println( "\nMy guess is that you are thinking of a " + output + "." );
    System.out.println( "I would ask you if I'm right, but I don't actually care." );
  }
}