import java.util.Scanner;

public class Program_27
{
  public static void main(String [] args)
  {
    Scanner input = new Scanner(System.in);
    
    int score = 0;
    
    System.out.println( "Are you ready for a quiz?" );
    input.next();
    System.out.println( "Okay, here it comes!" );
    
    System.out.println( "\nQ1) What is the capital of Alaska?" );
    System.out.println( "1) Melbourne" );
    System.out.println( "2) Anchorage" );
    System.out.println( "3) Juneau" );
    int question_1 = input.nextInt();
    
    if ( question_1 == 3 )
    {
      System.out.println( "That's right!" );
      score++;
    }
    else
      System.out.println( "Sorry. The answer is Juneau" );
    
    System.out.println( "\nQ2) Can you store the value \"cat\" in a variable of type int?" );
    System.out.println( "1) Yes" );
    System.out.println( "2) No" );
    int question_2 = input.nextInt();
    
    if ( question_2 == 2 )
    {
      System.out.println( "That's right!" );
      score++;
    }
    else
      System.out.println( "Sorry, \"cat\" is a string. ints can only store numbers." );
    
    System.out.println( "\nQ3) What is the result of 9+6/3?" );
    System.out.println( "1) 5" );
    System.out.println( "2) 11" );
    System.out.println( "3) 15/3" );
    int question_3 = input.nextInt();
    
    if ( question_3 == 2 ) 
    {
      System.out.println( "That's right!" );
      score++;
    }
    else
      System.out.println( "Sorry. The answer is 11" );

    System.out.println( "\nOverall, you got " + score + " out of 3 correct" );
    System.out.println( "Thanks for playing" );
  }
}

/* Are you ready for a quiz?  N
Okay, here it comes!

Q1) What is the capital of Alaska?
 1) Melbourne
 2) Anchorage
 3) Juneau

> 3

That's right!

Q2) Can you store the value "cat" in a variable of type int?
 1) yes
 2) no

> 1

Sorry, "cat" is a string. ints can only store numbers.

Q3) What is the result of 9+6/3?
 1) 5
 2) 11
 3) 15/3

> 2

That's correct!


Overall, you got 2 out of 3 correct.
Thanks for playing! */