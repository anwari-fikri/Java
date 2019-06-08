import java.util.ArrayList;
import java.util.Random;

public class Program_186
{
  public static void main(String [] args)
  {
    Random r = new Random();
    
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    
    for(int i = 0; i < 10; i++)
    {
      numbers.add(r.nextInt(99)+1);
    }
    
    System.out.println("ArrayList: " + numbers);
    
    int max = numbers.get(0);
    int save = 0;
    for(int i = 1; i < numbers.size(); i++)
    {
      if(max < numbers.get(i))
      {
        max = numbers.get(i);
        save = i;
      }
        
    }
    
    System.out.println("The largest value is " + max + ", which is in slot " + save);
  }
}