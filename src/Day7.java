import java.util.Scanner;

public class Day7 {
    public static void main(String[] args){

        // STRING METHODS AND ITS USES
/*        String name = "Ogwueleka Ikenna";

        int length = name.length(); // This tells you how many characters are in a string
        char letter = name.charAt(2); // This lets you pick out one specific character from a String by its position
        int index = name.indexOf("e"); // This tells you the first place a character appears
        int lastIndex = name.lastIndexOf("e"); //This tells you the last place a character appears

      //name = name.toUpperCase();
      //name = name.toLowerCase();
      //name = name.trim(); // used to eliminate all the white spaces
      //name = name.replace("e", "a"); // This replaces a character in a string with another one

        System.out.println(name.isEmpty()); // This is a method that returns boolean value and check if a String is empty

        if (name.isEmpty()){  // Can be used in IF statements
            System.out.println("Your name is empty");
        }
        else{
            System.out.println("hello " + name);
        }
*/
        // STRING METHODS AND ITS USES

        String name = "password";

/*
        if (name.contains(" ")){
            System.out.println("Your name contains a space"); // Checks to see if our String contains a character that will return a boolean
        }
        else {
            System.out.println("Your name does NOT contain a space");
        }
*/
        // CECKS TO SEE IF TWO STRINGS ARE EQUAL
/*
        //if (name.equals("password")){ // N.B the equals method does not account for case sensitivity
        if (name.equalsIgnoreCase("password")){ // This ignores the case sensitivity
            System.out.println("Your name can't be password");
        }
        else {
            System.out.println("Hello " + name);
        }

 */

        // SUBSTRING() = This a method that is used to extract a portion of a string
        // Strings have a builtin method called substring within this method you can list one of two indices, this method will create a new string based on the positioning of the indices (start, end0
        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("Enter your email: ");
        email = scanner.nextLine();

        if (email.contains("@")){
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);

            System.out.println(domain);
            System.out.println(username);
        }
        else {
            System.out.println("Emails must contain @");
        }
    }
}
