/*
Liam O'Dwyer
251324178
Jan 30 2023
This program takes three grades as user input and determines a weighted average of the three grades using assigned constant weights.
*/
package Q3;
import java.util.*; //imports all packages under the java.util class

public class GradeCalculator { //Declaration of the driver class
    public static void main(String[] args) // Declaration of the driver method
    {
        final double GRD1_WGT = 0.2,GRD2_WGT = 0.3, GRD3_WGT = 0.5; // Declaration and initialization of grade weight constants - the final modifier means they cant be changed
        Scanner userInput = new Scanner(System.in);//creates scanner object
        System.out.printf("************************%nLiam O'Dwyer%n251324178%nJan 30 2023%nThis program takes three grades as user input and determines a weighted average of the three grades using assigned constant weights.%n************************%n");
        System.out.printf("Please enter the first grade:");//prints message to console
        double grade1 = userInput.nextDouble(); // declares variable and assigns it to the next double value inputted
        System.out.printf("Please enter the second grade:"); //prints message to console (again)
        double grade2 = userInput.nextDouble(); // declares double variable and assigns it to the next inputted value
        System.out.printf("Please enter the third grade:"); //still prints a message to console
        double grade3 = userInput.nextDouble(); // declares a third double variable then assigns it to the next double inputted by the user
        System.out.printf("The final grade is: %.2f", (GRD1_WGT*grade1)+(GRD2_WGT*grade2)+(GRD3_WGT*grade3)); // using the printf method, prints a string with the weighted average rounded to two decimal places

    }
}
