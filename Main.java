import java.util.Scanner;
/**
 *
 * @author 
 */
public class Main { 

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input 
    Scanner input = new Scanner (System.in); 
    System.out.println ("How many chromebook chargers?"); 
  
   // declare a variable to store chromebook
   int chromebook = input.nextInt();
   System.out.println ("How many motherboards?");
   // declare a variable to store motherboards 
   int motherboards = input.nextInt ();
   
   System.out.println ("How many mice?");
   // declare a variable to store mice 
   int mice = input.nextInt (); 
   //declare a variable to store Subtotal 
   double Subtotal = chromebook*34.99 + motherboards *127.50 + mice*18.00;


   System.out.println("Subtotal = $" + Subtotal);
   // declare a variable to store Taxes 
   double Taxes = Subtotal*0.13; 
   System.out.println("Taxes = $" + Taxes);
   // declare a variable to store subtotal
   double Total = Subtotal + Taxes;
   System.out.println("Total = $" + Total);
   
   

  }
}
