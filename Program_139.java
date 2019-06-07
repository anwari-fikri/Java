import java.util.Random;

public class Program_139
{
  public static void main(String [] args)
  {
    Random rand = new Random();
    
    int [] values = new int [10];

    for ( int n = 0 ; n < 10 ; n++ )
    {
      values[n] = -123;
      System.out.println( "Slot " + n + " contains a " + values[n]);  
    }
      
    
  }
}