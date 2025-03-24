import java.util.Scanner;

/**
 * Calculates the average of the user's integer inputs 
 * and the input ends when a consecutive integer is given by the user.
 *
 * Programming Exercise 1
 * @author Daniel Becirevic - CPSC-3300 - AO2
 * @version 10/14/2023
 */
public class Average {
   /**
    * Calculates the average of inputted integers.
	 *
    * @param args Command line arguments - not used.
    */
   public static void main(String[] args) {   
      Scanner in = new Scanner(System.in);
      int currentInput;
      int lastInput;
      double average;
      int currentIndex = 0;
      int inputSize = 1;
      int total = 0;
            
      System.out.println("Enter an integer "
            + "(Consecutive integers will end input): ");
      currentInput = in.nextInt();
      
      total = currentInput;
      average = total / inputSize;
      System.out.println("The current average is " + average);
      
      do
      {
         lastInput = currentInput;
         
         System.out.println("\nEnter an integer ");
         currentInput = in.nextInt();
         
         if (currentInput == lastInput) {
            continue;
         }
         
         currentIndex++;
         
         total = total + currentInput; 
         
         inputSize++;
         
         average = (double) total / inputSize;
         System.out.println("The current average is " + average);
         
      }
      while (currentInput != lastInput);
   }
}
         
     