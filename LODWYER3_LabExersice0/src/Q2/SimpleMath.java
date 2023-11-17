/*
Liam O'Dwyer
251324178
January 23, 2023
This program accepts user input and converts from Celsius to Fahrenheit then prints the result to the console
*/
package Q2;
import java.util.Scanner; //importing the Scanner class from the java.util package

public class SimpleMath //creating a "SimpleMath" class, this is the entry point
{
    public static void main(String[] args) //main method header
    {
        double c, f; // Declaring the variables c and f and setting their values equal to 0
        boolean  programRunning = true;
        // The following lines print the messages in quotes to the console.
        System.out.print("Hello again! This is Liam O'Dwyer.\n"
                +"Student Number: 251324178\n"
                +"Date: January 23 2023\n"
                +"-----------------------------------\n"
                +"Let’s do some simple mathematical calculations. \n"
                +"Converting a temperature from Celsius scale to Fahrenheit scale . . .\n"
                // The \n character is at the end of every phrase so each message prints on its own line
        );
        while (programRunning)
        {
            Scanner input = new Scanner(System.in); // Used to set up a scanner for input
            System.out.println("Please input a temperature in Celsius"); //prints message to console
            if (input.hasNextDouble()) //IF the next input is a double, execute the following code
            {
                c = input.nextDouble(); //sets the value of c as equal to the next double value inputted by the user
                f = (c * 1.8) + 32;  //converts the value of c in Celsius to Fahrenheit then stores it in the f variable
                System.out.println(c + " Degrees Celsius is " + f + " Degrees Fahrenheit!");
                //The line above prints the value of c, then a string, the value of f, then another string
                System.out.println("Question 2 is successfully done!"); //prints a completion message
                programRunning = false; //breaks the while loop
            }
            else
            {
                System.out.println("please input a valid number");
            }
        }
    }
}

