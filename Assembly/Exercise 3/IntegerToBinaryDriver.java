import java.util.Scanner;
/**
 * Program that prompts the user to enter a positive integer between 0 and 255,
 * and prints out the binary representation.
 *
 * Programming Exercise 3
 * @author Daniel Becirevic - CPSC-3300 - AO2
 * @version 10/14/2023
 */
public class IntegerToBinaryDriver {
   
   /**
    * Converts a integer to its binary representation.
    *
    * @param integerIn the integer that will be used to return its 
    * binary equivalent.
    * @return String binary representation of integerIn.
    */
   private static String integerToBinary(int integerIn)
   {
      String binaryReverse = "";
      String binary = "";
      int binaryReverseIndex = 0;
      
      while (integerIn > 0) {
         if (integerIn % 2 == 1) {
            binaryReverse = binaryReverse + "1";
            integerIn = integerIn / 2;
         }
         else {
            binaryReverse = binaryReverse + "0";
            integerIn = integerIn / 2;
         }
      }
      
      binaryReverseIndex = binaryReverse.length() - 1;
      while (binaryReverseIndex >= 0) {
         binary = binary + binaryReverse.charAt(binaryReverseIndex);
         binaryReverseIndex--;
      }
      
      return binary;
   }
            
   /**
    * Takes a integer input and prints out the binary representation.
	 *
    * @param args Command line arguments - not used.
    */
   public static void main(String[] args) {   
      Scanner in = new Scanner(System.in);
      String binary = "";
      int integer;
      
      System.out.println("Enter an integer between 0 to 255");
      integer = in.nextInt();
      
      binary = integerToBinary(integer);
      System.out.println(binary);
   }
}
      
      