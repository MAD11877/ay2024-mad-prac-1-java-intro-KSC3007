import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);
    System.out.print("Number of rows: ");
    int rows = in.nextInt();
    for (int a = rows - 1; a >= 0; a--) {

      // Inner loop for columns
      for (int b = 0; b <= a; b++) {

          // Prints star and space
          System.out.print("*");
      }
      // By now we are done with single row so new
      // line
      System.out.println();
    }
  }
}
