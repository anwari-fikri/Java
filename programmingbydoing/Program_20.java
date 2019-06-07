import java.util.Scanner;

public class Program_20
{
  public static void main(String [] args)
  {
    Scanner input = new Scanner(System.in);
    
    System.out.println( "Your heignt in m" );
    double height_metres = input.nextDouble();
    System.out.println( "Your height in kg" );
    double weight_kilograms = input.nextDouble();
    
    double bmi = weight_kilograms / Math.pow( height_metres , 2 );
    System.out.println( "Your BMI is " + bmi );
    
    
    System.out.println( "Your heignt in inches" );
    double height_inches = input.nextDouble();
    height_metres = height_inches * 0.0254;
    System.out.println( "Your height in pounds" );
    double weight_pounds = input.nextDouble();
    weight_kilograms = weight_pounds * 0.453592;
    
    bmi = weight_kilograms / Math.pow( height_metres , 2 );
    System.out.println( "Your BMI is " + bmi );
    
    System.out.println( "Your heignt (foot only)" );
    double height_foot = input.nextDouble();
    height_metres = height_foot * 0.3048;
    
    System.out.println( "Your heignt (inches only)" );
    height_inches = input.nextDouble();
    height_metres = height_metres + height_inches * 0.0254;
    
    System.out.println( "Your height in pounds" );
    weight_pounds = input.nextDouble();
    weight_kilograms = weight_pounds * 0.453592;
    
    bmi = weight_kilograms / Math.pow( height_metres , 2 );
    System.out.println( "Your BMI is " + bmi );
   
  }
}