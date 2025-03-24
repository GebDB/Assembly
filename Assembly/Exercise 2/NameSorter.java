import java.util.Scanner;
import java.util.ArrayList;
/**
 * Takes 3 string inputs from the user and stores the input in an array.
 * The array is then sorted and printed in alphabetical order.
 *
 * Programming Exercise 2
 * @author Daniel Becirevic - CPSC-3300 - AO2
 * @version 10/14/2023
 */
public class NameSorter {
   /**
    * Sorts 3 names in alphabetical order.
	 *
    * @param args Command line arguments - not used.
    */
   public static void main(String[] args) {   
      ArrayList<String> names = new ArrayList<String>();
      Scanner in = new Scanner(System.in);
      String name;
      
      // prompt for user input 3 times.      
      System.out.println("Enter a name: ");
      name = in.next();
      names.add(name);
      
      System.out.println("Enter a name: ");
      name = in.next();
      names.add(name);
      
      System.out.println("Enter a name: ");
      name = in.next();
      names.add(name);
      
      name = names.get(1);
      
      // alphabetical sorting algorithm.
      while (!((name.compareToIgnoreCase(names.get(2)) <= 0)
            && (name.compareToIgnoreCase(names.get(0)) >= 0))) {
         
         if (name.compareToIgnoreCase(names.get(2)) > 0) {
            names.set(1, names.get(2));
            names.set(2, name);
         }
         else if (name.compareToIgnoreCase(names.get(0)) < 0) {
            names.set(1, names.get(0));
            names.set(0, name);
         }
         name = names.get(1);
      }
      
      // print all names.
      System.out.println();
      for (String currentName : names) {
         System.out.println(currentName);
      }
   }
}
      