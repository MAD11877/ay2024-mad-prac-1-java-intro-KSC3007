import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
     
    Scanner in = new Scanner(System.in);

    int count = in.nextInt();

    HashMap<Integer, Integer> frequencyMap = new HashMap<>();

    for (int i = 0; i < count; i++) {
      int num = in.nextInt();
      frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
    }

    int mode = 0;
    int maxfrequency = 0;

    for (int key : frequencyMap.keySet()) {
      if (frequencyMap.get(key) > maxfrequency) {
        maxfrequency = frequencyMap.get(key);
        mode = key;
      }
    }

    System.out.println(mode);

    in.close();
  }
}
