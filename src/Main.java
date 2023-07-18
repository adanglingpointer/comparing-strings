// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {

            // declare as explicit and inferred data types
        String s1 = "Hello!";
        var s2 = "Hello!";

        if (s1 == s2) {
            System.out.println("they match!");
        } else {
            System.out.println("they don't match!");
        }
            // returns 'they match!' because Java finds an existing value
            //  of Hello! and assigns the new variable as a reference to that obj.
            //  This process is known as interning.

            // forcing the creation of a new object
            //  with object creation syntax
        String s3 = new String("Hello!");
        String s4 = new String("Hello!");

        if (s3 == s4) {
            System.out.println("they match!");
        } else {
            System.out.println("they don't match!");
        }
            // returns 'they don't match!'

        if (s3.equals(s4)) {
            System.out.println("they match!");
        } else {
            System.out.println("they don't match!");
        }
            // they match!

        var s5 = "HELLO!";
        if (s3.equalsIgnoreCase(s5)) {
            System.out.println("they match!");
        } else {
            System.out.println("they don't match!");
        }
            // they match!

    }

}