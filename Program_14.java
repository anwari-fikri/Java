import java.util.Scanner;

public class Program_14
{
 public static void main( String[] args )
 {
  Scanner keyboard = new Scanner(System.in);

  int age;
  int height_feet;
  int height_inches;
  double weight;

  System.out.print( "How old are you? " );
  age = keyboard.nextInt();

  System.out.print( "How many feet tall are you? " );
  height_feet = keyboard.nextInt();
  
  System.out.print( "And how many inches? " );
  height_inches = keyboard.nextInt();

  System.out.print( "How much do you weigh in kg? " );
  weight = keyboard.nextDouble();

  System.out.println( "So you're " + age + " old, " + height_feet + "'" + height_inches + "\"" + " tall and " + weight + " kg heavy." );
 }
}