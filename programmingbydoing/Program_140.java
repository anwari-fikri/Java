import java.util.Random;

public class Program_140
{
  public static void main(String [] args)
  {
    Random rand = new Random();
    
    int [] values = new int [10];

    for ( int m = 0 ; m < 10 ; m++ )
    {
      values[m] = 1 + rand.nextInt(100);
      System.out.println( "Slot " + m + " contains a " + values[m]);       
    }
    
  }
}
