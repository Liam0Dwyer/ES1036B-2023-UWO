package Q2;
import java.util.Scanner; // imports the scanner class from java.util
import Q1.MethodDemo; //imports the MethodDemo class from Q1 package


public class SmallTalk {
    public static double celciusToFarenheit(double c) // defines the celciusToFarenheit function, using the public and static modifiers with a double return type
    {
        return (c * 1.8) + 32; // takes the value passed to the function 'c' and converts it to farenheit then returns the result
    }
    public static double farenheitToCelcius(double f) // defines the farenheitToCelcius function, using the public and static modifiers with a double return type
    {
        return (f / 1.8) - 32; // takes the value passed to the function as variable 'f' and converts it to celcius then returns the result
    }
    public static void main(String[] args) // main method header
    {
        MethodDemo.myHeader(1, 2, "This program emulates a conversation between two people while converting from celcius to farenheit and vise versa"); // calls the myHeader function from the MethodDemo class
        Scanner userIn = new Scanner(System.in); // creates new scanner object to allow for user input
        System.out.println("What is the outdoor temperature now?"); //prints message to console
        double celcius = userIn.nextDouble(); //declares sets the variable 'double' equal to the next double inputted by the user
        System.out.printf("\t I know you're used to Fahrenheit scale. %.2f degrees Celcius is %.2f degrees Farenheit", celcius, celciusToFarenheit(celcius)); //prints message to console, with the values of celcius and calls the celciusToFarenheit method and passes it the celcius value, which then returns the converted value
        System.out.printf("\nI am cold! What is the indoor temperature?");
        celcius = userIn.nextDouble(); // sets the celcius variable to the next double value inputted
        System.out.printf("\t%.2f degrees Celcius is %.2f degrees Farenheit", celcius, celciusToFarenheit(celcius)); // prints a line to console with the values of celcius and calls the celciusToFarenheit method and passes it the celcius value, which then returns the converted value
        System.out.printf("\nI see. Would you crank up the temperature?"); //prints message to console
        System.out.printf("\n\tOk I will! What temperature should I set the thermostat to?");//prints another message to the console
        double farenheit = userIn.nextDouble();// sets farenheit variable to the next double input
        System.out.printf("\tOh, you mean %.2f degrees Farenheit! Here you go\n\tBy the way, %.2f degrees Farenheit is %.2f degrees Celcius", farenheit, farenheit, farenheitToCelcius(farenheit));//prints message to console, with the values of farenheit and calls farenheitToCelcius, which returns a converted value
        System.out.printf("\nThank you! That was very nice of you");//prints final message to console
        MethodDemo.myFooter(2);


    }
}
