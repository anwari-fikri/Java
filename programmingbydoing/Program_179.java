import java.util.ArrayList;
import java.util.Random;

public class Program_179
{
  public static void main(String [] args)
  {
    Random r = new Random();
    
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    
    for(int i = 0; i < numbers.size(); i++)
    {
      numbers.add(r.nextInt(99)+1);
    }
    
    System.out.println("ArrayList: " + numbers );
  }
}