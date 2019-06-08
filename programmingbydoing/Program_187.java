import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class Program_187
{
  public static void main(String [] args)
  {
    Random r = new Random();
    
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    
    for(int i = 0; i < 10; i++)
    {
      numbers.add(r.nextInt(99)+1);
    }
    
    System.out.println("ArrayList before: " + numbers);
    
    Collections.sort(numbers);
    
    System.out.println("ArrayList after : " + numbers);
    
  }
}