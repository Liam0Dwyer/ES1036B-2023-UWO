/*
Liam O'Dwyer
251324178
Jan 30 2023
This program takes a four digit number from the user then separates it into digits, then returns the root mean squared of the four digits
*/
package Q1;
import java.util.Scanner; //imports the Scanner package
public class MathBugs //declaring the driver class
{
   public static void main(String[] args) // driver method header
   {
       Scanner userInput = new Scanner(System.in); // creates an object from the Scanner class named userInput
       System.out.printf("************************%nLiam O'Dwyer%n251324178%nJan 30 2023%nThis program takes a four digit number from the user then separates it into digits, then returns the root mean squared of the four digits%n************************%n");
           System.out.printf("Please enter a four digit number: %n"); // Prints a string to console prompting the user to input a number
           int number = userInput.nextInt(); // Declares the variable 'number' and sets it equal to the next integer input
           int thousandsDigit = number / 1000; // Declares the variable 'thousandsDigit' and sets it equal to number, divided by 1000, to get the thousands digit of the number
           int hundredsDigit = (number / 100) % 10; // Declares 'hundredsDigit' and then divides by 100 to put the number in the form ab.cd, then sets the variable equal to mod 10 to get the hundreds digit
           int tensDigit = (number / 10) % 10; // Same thing as above, however
           int onesDigit = number % 10; // takes the mod 10 of the original user inputted number to get the ones digit
           double rootMeanSquared = Math.sqrt(0.25 * (Math.pow(thousandsDigit, 2) + Math.pow(hundredsDigit, 2) + Math.pow(tensDigit, 2) + Math.pow(onesDigit, 2)));
           // the above line declares the variable 'rootMeanSquared' then sets it equal to the square root of the following equation (1/4)(a^2 + b^2 + c^2 + d^2)
           // The variable rootMeanSquared is not technically required, as you could do the entire calculation inside the printf() method however I assigned it to a variable because I think it makes the code look cleaner
           System.out.printf("The root mean square of the individual digits of %d (%d,%d,%d,%d) is: %.2f", number, thousandsDigit, hundredsDigit, tensDigit, onesDigit, rootMeanSquared);
   }
}


