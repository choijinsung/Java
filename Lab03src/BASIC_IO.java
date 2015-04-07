import java.util.*;

// An exploration of basic input and output.
class BASIC_IO {

   // Reads and processes string input.
   public static void main(String[] args) {

      Scanner stdin = new Scanner(System.in);

      // get first input
      System.out.println("Enter your name: ");
      String name = stdin.nextLine();

      // display output on console
      System.out.println("your name is " + name);

   }  // method main

}  // class BASIC_IO
