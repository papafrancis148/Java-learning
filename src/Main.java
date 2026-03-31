public class Main {
    public static void main(String[] args) {

        // This is my first Java Program

        /*
        This
        makes
        me
        very
        happy
         */
        System.out.println("I love my family!");
        System.out.println("They take care of me everyday!");
        System.out.println("I want to be better in life and have a strong faith in God!");

        int age = 21;
        int year = 2004;
        int quantity = 1;

        System.out.println("The year is " + year);

        double price = 19999.99;
        double gpa = 4.5;
        double temprature = -12.5;

        System.out.println("$"+ price);

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        System.out.println("I got an " + grade + " in Mathematics");

        boolean isStudent = false;
        boolean forSale = true;
        boolean isOnline = true;

        String name = "Ogwueleka Ikenna";
        String food = "Suya";
        String email = "johnpandora@gmail.com";
        String car = "Mustang";
        String color = "red";

        System.out.println("My name is " + name);
        System.out.println("I am " + age + " years old");
        System.out.println("I was born in the year " + year);
        System.out.println("I graduated with a gpa of " + gpa + " in the University of Debrecen");
        System.out.println("The gpa is known as " + grade + " in Highschool");


        System.out.println("Your choice is a " + color + " " + year + " " + car);
        System.out.println("The price is: " + currency + price);

        if(forSale){
            System.out.println("There is a " + car + " for sale");
        }
        else{
            System.out.println("The " + car + " is NOT for sale");
        }
    }

}

