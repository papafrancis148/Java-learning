import java.util.Scanner;

public class Day6 {
    public static void main(String[] args){
        // COMPOUND INTEREST CALCULATOR
/*
        Scanner scanner = new Scanner(System.in);

        double principal; // Stores the principal amount
        double rate; // Stores the interest rate after a couple of years
        int timesCompounded; //How often does the interest rate compound
        int years;
        double amount;

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();
        System.out.print("Enter the interest rate(in %): ");
        rate = scanner.nextDouble() / 100;
        System.out.print("Enter the number of times compounded per year: ");
        timesCompounded = scanner.nextInt();
        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        System.out.printf("The amount you get is $%,.2f after %d years\n", amount, years);

        scanner.close();

 */
        // NESTED IF STATEMENTS: This is having in if statement within an if statement if the condition for the initial if statement is true

        boolean isStudent = true;
        boolean isSenior = true;
        double price = 9.99;

        if(isStudent){
            if (isSenior){
                System.out.println("You get a senior discount of 20%");
                System.out.println("You get a student discount of 10%");
                price *= 0.7;
            }
            else {
                System.out.println("You get a student discount of 10%");
                price *= 0.9;
            }
        }
        else {
            if (isSenior){
                System.out.println("You get a senior discount of 20%");
                price *= 0.8;
            }
            else{
                price *= 1;
            }
        }

        System.out.printf("The price of the ticket is $%.2f", price);
    }
}
