import java.util.Scanner;

public class Day3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // ARITHMETIC OPERATORS
/*
         int x = 12;
         int y = 3;
         int z;

        // z = x + y;
        // z = x - y;
        // z = x * y;
        // z = x / y;
           z = x % y;
        System.out.println(z);
  */
        // AUGMENTED ASSIGNMENT OPERATORS
/*
        int x = 10;
        int y = 2;

        // x = x + y; (instead of having to type all this the shortcut would be +=)
        // x += y; (this is the shortcut)
        // x -= y;
        // x *= y;
        // x /= y;
           x %= y;
        System.out.println(x);
    */

        // INCREMENT AND DECREMENT OPERATORS
/*
        int x = 2;

       // x = x + 1; (For increment operators instead of doing this
       // x += 1; (Or this the  shortcut for increment is ++ which comes after the int variable)
       //   x++;
       //   x++;
       //   x++;
       // x = x - 1; (The same applies for decrement instead of this)
       // x -= 1; (Or this the shortcut for decrement is -- which comes after the int variable)
          x--;
          x--;
          x--;
        System.out.println(x);
*/

        // ORDER OF OPERATIONS [P-E-M-D-A-S] N.B- This is for the program to determine which way it solves first
/*
        double variable = 3 * 4 + (2 - 3) /12.2;

        System.out.println(variable);
*/

        // SHOPPING CART PROGRAM

        String item;
        double price;
        char currency ='$';
        int quantity;
        double total;

        System.out.print("What would you like to buy?: ");
        item = scanner.nextLine();
        System.out.print("How much does each cost?: ");
        price = scanner.nextDouble();
        System.out.print("How many do you want?: ");
        quantity = scanner.nextInt();

        total = price * quantity;
        System.out.println("\nYou have bought " + quantity + " " + item +"/s");
        System.out.println("Your total will cost " + total + currency + " thank you for shopping");

    }
}
