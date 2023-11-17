package Q2;
import Q1.StudentGradesByLiam;
public class ComplexNumberDemoLiam { // Class declaration
    public static void main(String[] args) { // main method header
        StudentGradesByLiam.myHeader(2,2,"Program takes user input as two complex numbers and does arithmetic");
        ComplexNumber x, y, addRes, mulRes; // declaration of ComplexNumber data type variables x, y, addRes, and mulRes
        x = dataEntry(); // sets x equal to the result of the dataEntry() method
        y = dataEntry(); // sets y equal to the result of the dataEntry() method
        System.out.println("\nYou have entered the two following complex numbers:"); // prints message
        x.displayRecForm(); // calls the displayRecForm() method inside the ComplexNumber class
        y.displayRecForm(); // calls the displayRecForm() method inside the ComplexNumber class
        addRes = complexAdder(x,y); // Sets addRes equal to the result of the complexAdder function when passed x and y
        mulRes = complexMultiplier(x,y);// Sets mulRes equal to the result of the complexMultiplier function when passed x and y
        System.out.printf("\n\nHere are the results of the arithmetic operations:"); //prints message
        if (addRes.getImaginary()>=0) // checks to see if the nonreal part of addRes is positive or negative and prints the correctly formatted string accordingly
        {
            System.out.printf("\nx + y = %.2f + %.2f, Magnitude: %.2f, Angle: %.2f degrees", addRes.getReal(), addRes.getImaginary(), addRes.getMagnitude(), addRes.getAngle());
        }
        else
        {
            System.out.printf("\nx + y = %.2f - %.2f, Magnitude: %.2f, Angle: %.2f degrees", addRes.getReal(), Math.abs(addRes.getImaginary()), addRes.getMagnitude(), addRes.getAngle());

        }
        if (mulRes.getImaginary()>=0) // checks to see if the nonreal part of mulRes is positive or negative and prints the correctly formatted string accordingly
        {
            System.out.printf("\nx * y = %.2f + %.2fi, Magnitude: %.2f, Angle: %.2f degrees", mulRes.getReal(), mulRes.getImaginary(), mulRes.getMagnitude(), mulRes.getAngle());

        }
        else
        {
            System.out.printf("\nx + y = %.2f - %.2fi, Magnitude: %.2f, Angle: %.2f degrees", mulRes.getReal(), Math.abs(mulRes.getImaginary()), mulRes.getMagnitude(), mulRes.getAngle());

        }
    }
    public static ComplexNumber dataEntry() // dataEntry Method Declaration
    {
        ++StudentGradesByLiam.instanceCounter; // increments instanceCounter int
        System.out.printf("\n========== Complex number %d data ==========\n", StudentGradesByLiam.instanceCounter); //prints message
        System.out.printf("Please enter real part of number: "); // prints message
        double real = StudentGradesByLiam.input.nextDouble(); // initializes real double and sets it equal to next double input
        System.out.printf("Please enter non-real part of number: "); // prints message
        double nonReal = StudentGradesByLiam.input.nextDouble(); // initializes real double and sets it equal to next double input
        ComplexNumber num = new ComplexNumber(real, nonReal); // creates new ComplexNumber object using the data inputted
        return num; // returns the previously created ComplexNumber object num
    }
    public static ComplexNumber complexAdder(ComplexNumber x, ComplexNumber y)
    {
        // Create a new ComplexNumber object and set its real and imaginary parts to the sum of the corresponding parts of x and y
        ComplexNumber num = new ComplexNumber((x.getReal()+y.getReal()), (x.getImaginary()+y.getImaginary()));
        // Return the ComplexNumber object representing the sum of the two complex numbers
        return num;
    }

    public static ComplexNumber complexMultiplier(ComplexNumber x, ComplexNumber y)
    {
        // Create a new ComplexNumber object and set its real and imaginary parts to the product of the corresponding parts of x and y, calculated using the formula for multiplication of complex numbers
        ComplexNumber num = new ComplexNumber(((x.getReal()*y.getReal())-(x.getImaginary()*y.getImaginary())), ((x.getImaginary()*y.getReal())+((x.getReal()*y.getImaginary()))));
        // Return the ComplexNumber object representing the product of the two complex numbers
        return num;
    }
}
