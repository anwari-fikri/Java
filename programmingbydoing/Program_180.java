import java.util.ArrayList;
import java.util.Random;

public class Program_180
{
  public static void main(String [] args)
  {
    Random r = new Random();
    
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    
    for(int i = 0; i < numbers.size(); i++)
    {
      numbers.add(r.nextInt(99)+1);
    }
    
    ArrayList<Integer> numbers2 = new ArrayList<Integer>(numbers);
    numbers.set(9,-7);
    
    System.out.println("ArrayList: " + numbers);
    System.out.println("ArrayList: " + numbers2);
  }
}