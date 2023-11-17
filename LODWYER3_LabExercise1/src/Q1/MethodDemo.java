package Q1; // package
import java.util.Scanner; //imports scanner

public class MethodDemo { // driver method
    public static void myHeader(int labNum, int questionNum, String description) // defines myHeader method, which takes two ints and a string as input
    {
        System.out.printf("************************%nFull Name: Liam O'Dwyer%nLab Number: %d, Question: %d %nProgram Description: %s%n************************%n", labNum, questionNum, description);
        //above line prints a message to the console which includes the values it was passed
    }

    public static void myFooter(int questionNum) //defines myFooter method, which takes an int as input
    {
        System.out.printf("%n********** Signing off from question %d -Liam **********", questionNum); //prints a message with the passed valuie
    }
    public static double cmToInchConverter(double cm) //defines cmToInchConverter method, which takes a double as input
    {

        return cm/2.54; //returns the value divided by 2.54
    }
    public static void main(String[] args) //driver method
    {
        Scanner userIn = new Scanner(System.in); // creates scanner object
        myHeader(1, 1, "This program takes user input for a value in centimeters, then uses a method to convert to inches, then inches and feet");
        // myHeader call prints a header to the console
        System.out.printf("Please enter a value in cm:%n"); //prints a message to the console
        double cm = userIn.nextDouble(); //sets the cm variable to the next double input
        double inch = cmToInchConverter(cm); //setting this inch as a variable saves like 4 function calls
        System.out.printf("%.2f cm = %.2f inches!%n%.2f inches = %d ft %.2f inches!", cm, inch, inch, (int)(inch/12),(inch%12)); // prints message then inserts cm, inch, casts inch to an int value and divides by 12, then int mod 12 to get the feet and leftover inches
        myFooter(1); //myFooter call prints a footer to the console
    }
}
